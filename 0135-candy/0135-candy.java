class Solution {
    public int candy(int[] ratings) {
        int left[]=new int[ratings.length];
        left[0]=1;
        int right[]=new int[ratings.length];
        int n=ratings.length;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
        }
        right[n-1]=1;
        int max=0;
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
            max+=Math.max(left[i],right[i]);
        }
        max+=Math.max(left[n-1],right[n-1]);
        return max;
        
    }
}