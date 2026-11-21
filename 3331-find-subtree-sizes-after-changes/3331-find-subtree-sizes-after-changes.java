
import java.util.*;

class Solution {

    public int[] findSubtreeSizes(int[] parent, String s) {

        int n = parent.length;

        // Original generic tree
        List<Integer>[] tree = new ArrayList[n];

        for (int i = 0; i < n; i++)
            tree[i] = new ArrayList<>();

        for (int i = 1; i < n; i++)
            tree[parent[i]].add(i);

        // Nearest matching ancestor
        int[] last = new int[26];
        Arrays.fill(last, -1);

        int[] newParent = parent.clone();

        dfs(0, tree, last, newParent, s);

        // Build modified tree
        List<Integer>[] modified = new ArrayList[n];

        for (int i = 0; i < n; i++)
            modified[i] = new ArrayList<>();

        for (int i = 1; i < n; i++)
            modified[newParent[i]].add(i);

        // Iterative traversal
        int[] order = new int[n];
        int[] stack = new int[n];
        int top = 0, count = 0;

        stack[top++] = 0;

        while (top > 0) {

            int u = stack[--top];
            order[count++] = u;

            for (int v : modified[u])
                stack[top++] = v;
        }

        // Calculate subtree sizes
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for (int i = count - 1; i > 0; i--) {

            int u = order[i];
            ans[newParent[u]] += ans[u];
        }

        return ans;
    }

    void dfs(int u, List<Integer>[] tree,
             int[] last, int[] newParent, String s) {

        int ch = s.charAt(u) - 'a';

        int old = last[ch];

        if (old != -1)
            newParent[u] = old;

        last[ch] = u;

        for (int v : tree[u]) {
            dfs(v, tree, last, newParent, s);
        }

        last[ch] = old;
    }
}
