import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;

        for (String op : operations) {

            if (op.equals("C")) {
                ans -= stack.pop();
            } 
            else if (op.equals("D")) {
                int val = stack.peek() * 2;
                stack.push(val);
                ans += val;
            } 
            else if (op.equals("+")) {
                int top = stack.pop();
                int newVal = top + stack.peek();
                stack.push(top);      // restore
                stack.push(newVal);
                ans += newVal;
            } 
            else {
                int val = Integer.parseInt(op);
                stack.push(val);
                ans += val;
            }
        }

        return ans;
    }
}