class Solution {
    public int maxActiveSectionsAfterTrade(String s){
        int max=0;
        int res=0;
        int i=0;
        int n=s.length();
        int zerocount=0;
        while(i<n && s.charAt(i)=='1'){
            res++;
            i++;
        }
        while(i<n && s.charAt(i)=='0'){
            zerocount++;
            i++;
        }
        for(;i<n;){
            while(i<n && s.charAt(i)=='1'){
                res++;
                i++;
            }
            int end=i-1;
        
            if(i<n && s.charAt(i)=='0'){
                while(i<n && s.charAt(i)=='0'){
                    zerocount++;
                    i++;
                }
                max=Math.max(max,zerocount);
                zerocount=i-end-1;
            }
        }
        return res+max;

        
    }
}