class Solution {
    public String convertToTitle(int n) {
       StringBuilder s=new StringBuilder();
       while(n>0){
        n--;
        char ch=(char)('A'+(n%26));
        s.append(""+ch);
        n/=26;
       }
       
       return s.reverse().toString();
    }
}