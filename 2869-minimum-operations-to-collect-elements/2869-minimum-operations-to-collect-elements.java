class Solution {
    public int minOperations(List<Integer> nums, int k) {
        long flag = 0; // Use this long variable to mark numbers
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) <= k) {
                flag |= 1L << (nums.get(i) - 1); // Mark if the number is less than or equal to the required k
            }
            if (flag == (1L << k) - 1) { // If all numbers from 1 to k are marked
                return nums.size() - i;
            }
        }
        return -1;
    }
}