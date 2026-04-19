class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {5,3,2};

        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }

        return n == 1;
    }
}