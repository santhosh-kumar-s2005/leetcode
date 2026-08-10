class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      List<List<Integer>> res=new ArrayList<>();
      HashSet<Integer> n2=new HashSet<>();
      HashSet<Integer> n1=new HashSet<>();
      for(int i:nums2){n2.add(i);}
      res.add(new ArrayList<>());
      for(int i:nums1){
        if(n2.add(i)){
            res.get(0).add(i);
        }
        n1.add(i);
      }  
      res.add(new ArrayList<>());
      for(int i:nums2){
        if(n1.add(i)){
            res.get(1).add(i);
        }
      }
      return res;
    }
}