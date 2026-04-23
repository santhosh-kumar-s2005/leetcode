class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;

        HashMap<Integer, ArrayList<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        long[] res = new long[n];

        for (int val : indexMap.keySet()) {
            ArrayList<Integer> list = indexMap.get(val);
            int m = list.size();

            if (m == 1) {
                res[list.get(0)] = 0;
                continue;
            }

            long[] prefix = new long[m];
            prefix[0] = list.get(0);

            for (int i = 1; i < m; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            for (int i = 0; i < m; i++) {
                long idx = list.get(i);

                long left = idx * i - (i > 0 ? prefix[i - 1] : 0);
                long right = (prefix[m - 1] - prefix[i]) - idx * (m - i - 1);

                res[(int) idx] = left + right;
            }
        }

        return res;
    }
}