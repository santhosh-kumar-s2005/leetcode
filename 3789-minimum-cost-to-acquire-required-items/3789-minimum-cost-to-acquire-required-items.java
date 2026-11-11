class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long ans=Math.min((long)costBoth,(long)cost1+cost2)*Math.min((long)need1,(long)need2);
        if(need1==need2){return ans;}
        if(need1<need2){
            need2-=need1;
            ans+=Math.min((long)costBoth,(long)cost2)*need2;
        }
        else{
            need1-=need2;
            ans+=Math.min((long)costBoth,(long)cost1)*need1;
        }
        return ans;

    }
}