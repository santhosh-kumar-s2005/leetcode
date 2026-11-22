class Solution {
    public boolean checkString(String s) {
        boolean bfound=false;
        for(char i:s.toCharArray())
        {
            if(!bfound && i=='b') bfound=true;
            if(i=='a' && bfound) return false;
        }
        return true;
        
    }
}