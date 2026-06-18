class Solution {
    public double angleClock(int hour, int minutes) {
        double x=Math.abs((((hour%12)*30)+(0.5*minutes))-6*minutes);
        return Math.min(x,360-x);
        
    }
}