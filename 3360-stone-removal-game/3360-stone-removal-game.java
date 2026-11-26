class Solution {
    public boolean canAliceWin(int n) {
        int i=1;
        int st=10;
        int t=10;
        while(n>=st){
            st+=(--t);
            i++;
            // System.out.println(n+" "+st);
        }
        return (i%2==0);
        
    }
}