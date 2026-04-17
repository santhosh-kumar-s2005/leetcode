class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(int i=0;i<queries.length;i++){
            queries[i]=findindex(nums,nums[queries[i]],queries[i],map);
        }
       List<Integer> res = Arrays.stream(queries).boxed().toList();
        return res;
    }
    public int findindex(int[] words, int target, int startIndex,HashMap<Integer,ArrayList<Integer>> map) {
        
    ArrayList<Integer> list = map.get(target);
    int n = words.length;

    if (list.size() == 1) return -1; // only itself exists

    // Binary search position
    int pos = Collections.binarySearch(list, startIndex);

    int left = (pos - 1 + list.size()) % list.size();
    int right = (pos + 1) % list.size();

    int leftIdx = list.get(left);
    int rightIdx = list.get(right);

    int d1 = Math.abs(leftIdx - startIndex);
    int d2 = Math.abs(rightIdx - startIndex);

    int dist1 = Math.min(d1, n - d1);
    int dist2 = Math.min(d2, n - d2);

    return Math.min(dist1, dist2);
}
 


}