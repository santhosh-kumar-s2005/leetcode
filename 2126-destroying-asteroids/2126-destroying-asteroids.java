class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m1=mass;
        
        for(int i:asteroids){
            if(i>m1){
                return false;
            }
            if(asteroids[asteroids.length-1]<=m1){
                return true;
            }
            m1+=i;
        }
        return true;
        
    }
}