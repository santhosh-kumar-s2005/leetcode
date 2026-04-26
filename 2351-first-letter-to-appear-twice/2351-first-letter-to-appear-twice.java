class Solution {
    public char repeatedCharacter(String s) {
        int res=0;
        for(char i:s.toCharArray()){
            int temp=res;
            res=res|(1<<(i-'a'));
            if(temp==res){
                return i;
            }
        }
        return 'a';
        
    }
}