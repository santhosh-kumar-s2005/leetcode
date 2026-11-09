class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int requestcount[]=new int[k];
        int processrequest[]=new int[k];
        int mostnoofrequest=0;
        PriorityQueue<int[]> busy=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
    
                return Integer.compare(a[1],b[1]);
        });
        ArrayList<Integer> freeserverindx=new ArrayList<>();
        for(int i=0;i<k;i++){
            freeserverindx.add(i);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arrival.length;i++){
            int current_time=arrival[i];
            int ind=i%k;
            while(!busy.isEmpty() && busy.peek()[1] <= current_time){
                freeserverindx.add(busy.poll()[0]);
            }
            if(processrequest[ind]>current_time){
                if(busy.size()==k ||freeserverindx.size()==0){
                    ind=-1;
                }
                else{
                    boolean found=false;
                    Collections.sort(freeserverindx);
                    for(int j=0;j<freeserverindx.size();j++){
                        if(freeserverindx.get(j)>=ind){
                            ind=freeserverindx.get(j);
                            found=true;
                            freeserverindx.remove(j);
                            break;
                        }
                    }
                    if(!found){
                       ind=freeserverindx.get(0);
                       freeserverindx.remove(0);
                    }
                    
                }
                // // int j=(i+1)%k;
                // while(true){
                //     if(j==(i%k)){
                //         ind=-1;
                //         break;
                //     }
                //     if(processrequest[j]<=current_time){
                //         ind=j;
                //         break;
                //     }
                //     j=(j+1)%k;

                // }
            }
            else{
                freeserverindx.remove(Integer.valueOf(ind));
            }
     //       System.out.println(ind);
            if(ind==-1){continue;}
        
            processrequest[ind]=load[i]+current_time;
            busy.offer(new int[]{ind,load[i]+current_time});
            mostnoofrequest=Math.max(mostnoofrequest,++requestcount[ind]);
        }
        for(int i=0;i<k;i++){
            if(requestcount[i]==mostnoofrequest){
                res.add(i);
            }
        }
        // System.out.println(Arrays.toString(processrequest));
        // System.out.println(Arrays.toString(requestcount));
        // System.out.println(mostnoofrequest);
        return res;

    }
}