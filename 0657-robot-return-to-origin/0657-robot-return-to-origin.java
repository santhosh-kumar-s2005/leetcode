class Solution {
    public boolean judgeCircle(String moves) {
        int freq[]=new int[2];
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                    freq[0]++;
            }
            if(ch=='D'){
                    freq[0]--;
            }
             if(ch=='R'){
                    freq[1]++;
            }
             if(ch=='L'){
                    freq[1]--;
            }
            
        }
        return (freq[0]==0 && freq[1]==0);
        
    }
}