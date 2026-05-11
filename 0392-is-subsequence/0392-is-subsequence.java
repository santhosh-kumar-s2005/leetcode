class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(char i :s.toCharArray()){
            boolean found=false;
            for(;j<t.length();j++){
                if(i==t.charAt(j)){
        
                    j++;
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
        
    }
}