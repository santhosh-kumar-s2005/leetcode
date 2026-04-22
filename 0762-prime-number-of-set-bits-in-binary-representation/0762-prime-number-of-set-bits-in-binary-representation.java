class Solution {
    public int countPrimeSetBits(int left, int right) {
        int dp[]=new int[32];
        dp[0]=-1;
        dp[1]=-1;
        for(int i=2;i<=31;i++){
            if(dp[i]==0){
                for(int j=i*i;j<=31;j+=i){
                    dp[j]=-1;
                }
            }
        }
        int res=0;
     
      
        for(int i=left;i<=right;i++){
            int count=Integer.bitCount(i);
            if(dp[count]==0){
                System.out.println(count);
                res++;
            }
        }
        return res;

        
    }
}