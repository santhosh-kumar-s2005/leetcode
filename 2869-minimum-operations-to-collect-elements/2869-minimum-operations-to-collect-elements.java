class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int op=0;
        for(int i=nums.size()-1;i>=0;i--){
            op++;
            if(nums.get(i)>k) continue;
            set.add(nums.get(i));
            if(set.size()==k){
                break;
            }
        }
        return op;
 

 
    }
}    