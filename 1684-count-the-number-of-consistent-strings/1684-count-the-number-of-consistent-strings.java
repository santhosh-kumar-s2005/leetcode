class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char i:allowed.toCharArray()){
            set.add(i);
        }
        int count=0;
        for(String i:words){
            boolean found=true;
            for(char j:i.toCharArray()){
                if(!set.contains(j)){
                    found=false;
                    break;

                }
            }
            if(found){
                count++;
            }
        }
        return count;
    }

}