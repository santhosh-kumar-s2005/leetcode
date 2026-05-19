class Solution {
    public int maxVowels(String s, int k) {
        int currcount=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                currcount++;
            }
        }
        int maxcount=currcount;
         for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i-k))){
                currcount--;
            }
            if(vowel(s.charAt(i))){
                currcount++;
                maxcount=Math.max(maxcount,currcount);
            }
            
        }
        return maxcount;
    }
    boolean vowel(char ch){
        return (ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u');
    }
}