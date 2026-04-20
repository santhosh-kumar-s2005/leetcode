class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=count(i);
        }
        return arr;
        
    }
    public int count(int n){
        return (n==0)?0:((n&1)==1)?1+count(n>>1):count(n>>1);
    }
}