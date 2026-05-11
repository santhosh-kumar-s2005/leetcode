class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> res = new ArrayList<>();
        for(int i:nums){
            String t=String.valueOf(i);
            for(int j=0;j<t.length();j++){
                res.add(t.charAt(j)-'0');
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}