class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        int t=64;
        int a=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int ch=columnTitle.charAt(i)-((char)(t));
            n=n+((int)Math.pow(26,a++)*ch);
        }
        return n;
        
    }
}