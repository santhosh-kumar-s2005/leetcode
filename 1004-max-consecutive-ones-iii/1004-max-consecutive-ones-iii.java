class Solution {
    public int longestOnes(int[] nums, int k) {
    ArrayList<Integer> counts=new ArrayList<>();
    int currcount=0;
    int i=0;
    int ptr=0;
    int tk=k;
    while(i<nums.length && (k>0||nums[i]==1) ){
        currcount++;
        if(nums[i]==0){
            if(counts.isEmpty()){
                counts.add(currcount);
            }
            else{
                counts.add(currcount);
            }
            k--;
        }
        i++;
    }
    System.out.println(currcount);
    int maxcount=currcount;
    int totalcount=currcount;
    for(;i<nums.length;i++){
        if(nums[i]==1){
            currcount++;
            totalcount++;
        }
        else{
            if(tk>0){
            currcount=++totalcount-counts.get(ptr++);
            counts.add(totalcount);
            }
            else
            {
                currcount=0;
            }   
        }
        System.out.println(currcount);
        maxcount=Math.max(maxcount,currcount);
    
    }
    return maxcount;
    














        // int temp=k;
        // int currones=0;
        // int firstpos=-1;
        // int countbeforefirstpos=0;
        // int i=0;
        // while(tk-->0 ||arr[i]==1){
        //     if(arr[i]==0){
        //         if(firstpos==-1){
        //             countbeforefirstpos=currones;
        //             firstpos=i;
        //         }
        //         tk--;
        //     }
        //     currones++; 
        //     i++;
        // }
        // for(;i<nums.length;i++){
        //     if(arr[i]==0){
        //         currones-=countbeforefirstpos;
                 
        //     }
        // }

        
    }
}