class Solution {
    public int calPoints(String[] operations) {
       ArrayList<Integer> arr=new ArrayList<>();
       int ans=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            int si=arr.size();
            
            if(op.equals("C")){
                if(si>=1){
                    ans-=arr.remove(si-1);
                }
            }
            else if(op.equals("D")){
                if(si>=1){
                arr.add(arr.get(si-1)*2);
                ans+=arr.get(si);
                }

            }
            else if(op.equals("+")){
                if(si>=2){
                    arr.add(arr.get(si-1)+arr.get(si-2));
                    ans+=arr.get(si);
                }

            }
            else{
                ans+=Integer.parseInt(op);
                arr.add(Integer.parseInt(op));
            }
            System.out.println(ans);
        }
        return ans;
        
    }
}