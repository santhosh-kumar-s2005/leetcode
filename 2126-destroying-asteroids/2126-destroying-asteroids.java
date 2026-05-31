class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m1=mass;
        for(int i:asteroids){
            if(i>m1){
                // System.out.println(i);
                // System.out.println(mass);
                return false;
            }
            m1+=i;
        }
        return true;
        
    }
}