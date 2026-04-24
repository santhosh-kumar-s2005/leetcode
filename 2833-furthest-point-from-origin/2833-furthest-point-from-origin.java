class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lcount=0;
        int rcount=0;
        int dashcount=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') lcount++;
            else if(ch=='R') rcount++;
            else dashcount++;
        }
        if(lcount==rcount){
            return dashcount;
        }
        if(lcount>rcount){
            return lcount-rcount+dashcount;
        }
        return rcount-lcount+dashcount;

        
    }
}