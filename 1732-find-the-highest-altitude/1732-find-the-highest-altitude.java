class Solution {
    public int largestAltitude(int[] gain) {
        int result=gain[0];
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
            result=Math.max(result,gain[i]);
        }
        return Math.max(result,0);
    
        
    }
}