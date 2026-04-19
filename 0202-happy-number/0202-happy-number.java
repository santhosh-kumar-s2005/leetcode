class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            if(!set.add(n)){
                return false;
            }
            n=call(n); 
           System.out.println(n);
        }
        return true;
    }
    public static int call(int n){
        return (n==0)?0:((n%10)*(n%10))+call(n/10);
    }
}