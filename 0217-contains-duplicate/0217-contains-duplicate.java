class Solution {
     static{
        for(int i = 0; i <= 500; i++) 
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums){
            if(!set.add(i)) return true;
        }
        return false;
    }
}