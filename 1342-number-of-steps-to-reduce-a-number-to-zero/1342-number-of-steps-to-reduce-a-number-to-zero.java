class Solution {
    public int numberOfSteps(int n) {
        int steps=0;
        while(n!=0){
            n=((n&1)==0)?n>>1:n-1;
            steps++;
        }
        return steps;
        
    }
}