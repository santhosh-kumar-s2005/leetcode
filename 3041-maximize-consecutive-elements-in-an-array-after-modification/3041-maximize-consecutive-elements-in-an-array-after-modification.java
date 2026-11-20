class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums[nums.length - 1] + 2];  // dp[x]: the longest run ending at x
        for (int x : nums) {
            dp[x + 1] = dp[x] + 1;  // bump
            dp[x] = dp[x - 1] + 1;  // keep
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}