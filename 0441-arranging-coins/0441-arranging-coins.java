class Solution {
    public int arrangeCoins(int n) {
        int coin=1;
        int row=0;
        while(coin<=n){
            row++;
            n-=coin;
            coin++;
    
        }
        return row;
    }
}