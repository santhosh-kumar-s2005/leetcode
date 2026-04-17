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
        if(!map.containsKey(target)){
            return -1;
        }

        
        int steps=Integer.MAX_VALUE;
        ArrayList<Integer> list=map.get(target);
        if (list.size() == 1) return -1;
        int pos=Collections.binarySearch(list,startIndex);
        int left=(pos-1+list.size())%list.size();
        int right=(pos+1)%list.size();
        int n=words.length;
        steps=Math.min(steps,Math.min(Math.abs(list.get(left)-startIndex),n-Math.abs(list.get(left)-startIndex)));
        steps=Math.min(steps,Math.min(Math.abs(list.get(right)-startIndex),n-Math.abs(list.get(right)-startIndex)));
       
        return steps==Integer.MAX_VALUE?-1:steps;
 
    }    

}