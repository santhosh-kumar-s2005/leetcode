class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
      int minsum=Integer.MAX_VALUE;
      int n=nums.size();
      for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=nums.get(j);
            if((j-i+1)>=l && (j-i+1<=r) && sum>0){
                System.out.println(i+" "+j);
                minsum=Math.min(minsum,sum);
            }
             if(j-i>r) break;
        }
      }
      return (minsum!=Integer.MAX_VALUE)?minsum:-1;
        
    }
}