class Solution {
    public int numberOfSteps(int n) {
        // int steps=0;
        // while(n!=0){
        //     n=((n&1)==0)?n>>1:n-1;
        //     steps++;
        // }
        // return steps;
        return rec(n);
    }
    public static int rec(int n){
        return (n==0)?0:(n%2==0)?1+rec(n/2):1+rec(n-1);
    }
}