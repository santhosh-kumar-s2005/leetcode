class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int xor=0;
        for(int i:nums){
            if(!set.add(i)){
                xor^=i;
            }
        }
        return xor;
    }
}