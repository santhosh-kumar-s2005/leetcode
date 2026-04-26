class Solution {
    public int maximumStrongPairXor(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
            arr.add(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                }
            }
        }
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size()/2;i++){
            max=Math.max(max,arr.get(j)^arr.get(j+1));
            j+=2;
        }
        return max;
    }
}