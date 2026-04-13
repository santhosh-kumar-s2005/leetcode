class Solution {
    public int calPoints(String[] operations) {
       ArrayList<Integer> arr=new ArrayList<>();
       int ans=0;
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].equals("C")){
                if(arr.size()>=1){
                    ans-=arr.remove(arr.size()-1);
                }
            }
            else if(operations[i].equals("D")){
                if(arr.size()>=1){
                arr.add(arr.get(arr.size()-1)*2);
                ans+=arr.get(arr.size()-1);
                }

            }
            else if(operations[i].equals("+")){
                if(arr.size()>=2){
                    arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
                    ans+=arr.get(arr.size()-1);
                }

            }
            else{
                ans+=Integer.parseInt(operations[i]);
                arr.add(Integer.parseInt(operations[i]));
            }
            System.out.println(ans);
        }
        return ans;
        
    }
}