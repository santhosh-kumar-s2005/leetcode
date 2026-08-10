class Solution {
    public int largestAltitude(int[] gain) {
        int m=Math.max(0,gain[0]);
        int tm=gain[0];
        for(int i=1;i<gain.length;i++){
            m=Math.max(tm+gain[i],m);
            tm=tm+gain[i];
        }
        return m;

    }
}