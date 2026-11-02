class Solution {
    public int minMoves2(int[] nums) {

        // 7 6 2 9 1
        // 1 2 6 7 9
        // 5 4 0 1 3
        // 1 2 3
        // 1    1
        // 2
        // 1 2 9 10
        // 4 3 4 5
        // 7 8 9 1 2 3
        // 1 2 3 4
        // 1 0 1 2
        Arrays.sort(nums);
        int avg=get(nums);
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=Math.abs(nums[i]-avg);
        }
        return result;

        
    }
    public int get(int nums[]){
        int length=nums.length;
        if(length%2==0){
            return (nums[length/2]+nums[(length/2)-1])/2;
        }
        return nums[length/2];
    }
}