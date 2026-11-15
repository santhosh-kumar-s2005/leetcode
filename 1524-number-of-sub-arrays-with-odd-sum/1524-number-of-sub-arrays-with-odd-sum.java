class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixsum[]=new int[arr.length];
        prefixsum[0]=arr[0];
        int n=arr.length;
        long count=0;
        if(prefixsum[0]%2==1){
            count+=1;
        }
         for(int i=1;i<n;i++)
        {
            prefixsum[i]=prefixsum[i-1]+arr[i];
            if(prefixsum[i]%2==1){
                count+=1;
            }
        }
       
        return (int)((count*(n+1-count))%1000000007);


        
    }
}