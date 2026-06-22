class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0||n==1) return n;
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        int maxlen=0;
        int i=0;
        int j=1;
        while(i<n){
            
            while(j<n && set.add(s.charAt(j))){
                j++;
            }
            maxlen=Math.max(j-i,maxlen);
            while( i<n && j<n && i<j){
                set.remove(s.charAt(i));
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                i++;
            }
            set.add(s.charAt(i));
            i++;
            j++;
        }
        return maxlen;

    }
}