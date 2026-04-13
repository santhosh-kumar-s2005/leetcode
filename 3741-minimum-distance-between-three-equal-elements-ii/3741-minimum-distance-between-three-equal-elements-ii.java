class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int[] arr = map.getOrDefault(nums[i], new int[]{-1, -1, -1});
            
            // shift indices
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = i;

            // if we have 3 occurrences
            if (arr[0] != -1) {
                ans = Math.min(ans, 2 * (arr[2] - arr[0]));
            }

            map.put(nums[i], arr);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}