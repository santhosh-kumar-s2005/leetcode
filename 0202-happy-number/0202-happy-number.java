class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sum(slow);          // 1 step
            fast = sum(sum(fast));     // 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    public int sum(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }
}