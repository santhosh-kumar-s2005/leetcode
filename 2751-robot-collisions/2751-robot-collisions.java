import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] h, String dir) {
        int n = pos.length;

        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;

        int[] p = pos;
        Arrays.sort(order, (a, b) -> Integer.compare(p[a], p[b]));

        int[] newPos = new int[n];
        int[] newH = new int[n];
        char[] d = dir.toCharArray();
        char[] newD = new char[n];
        int[] idx = new int[n];

        for (int i = 0; i < n; i++) {
            newPos[i] = pos[order[i]];
            newH[i] = h[order[i]];
            newD[i] = d[order[i]];
            idx[i] = order[i];
        }

        pos = newPos;
        h = newH;
        d = newD;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (d[i] == 'R') {
                st.push(i);
            } else {
                while (!st.isEmpty() && h[i] > 0) {
                    int j = st.peek();

                    if (h[j] == -1) {
                        st.pop();
                        continue;
                    }

                    if (h[j] == h[i]) {
                        h[j] = -1;
                        h[i] = -1;
                        st.pop();
                        break;
                    } else if (h[j] < h[i]) {
                        h[i]--;
                        h[j] = -1;
                        st.pop();
                    } else {
                        h[j]--;
                        h[i] = -1;
                        break;
                    }
                }
            }
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            if (h[i] != -1) {
                ans[idx[i]] = h[i];
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans[i] != -1) res.add(ans[i]);
        }

        return res;
    }
}