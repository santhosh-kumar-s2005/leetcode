class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,ninepos=n;
        int i=n-1;
        for(;i>=0;i--){
            if(digits[i]!=9){
                break;
            }
            ninepos=i;
        }
        if(ninepos==0){
            int res[]=new int[n+1];
            res[0]++;
            return res;
        }
        else if(ninepos==n){
            digits[n-1]++;
            return digits;
        }

            digits[i]++;
          //  Arrays.fill(digit,i+1,0);
          for(i=i+1;i<n;i++){
            digits[i]=0;
          }
          return digits;

        
    }
}