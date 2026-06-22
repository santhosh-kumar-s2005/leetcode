class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i) ){
                t.append(Character.toLowerCase(i));
            }
        }
        if(s.length()==0 && s.length()==1) return true;
        int i=0;
        int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

        

        
    }
}