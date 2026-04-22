class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum=0;
        int dup=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            sum+=i;
            if(!set.add(i)){
                dup=i;
            }
        }
        sum-=dup;
        int n=nums.length;
        n=n*(n+1);
        n/=2;
        return new int[]{dup,n-sum};
        
    }
}