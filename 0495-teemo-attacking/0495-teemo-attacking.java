class Solution {
    public int findPoisonedDuration(int[] time, int duration) {
        int res=duration;
        duration--;
        int prev=time[0]+duration;
        for(int i=1;i<time.length;i++){
            res+=(prev>=time[i])?(time[i]+duration)-prev:duration+1;
            prev=time[i]+duration;
        }
        return res;
    }
}