class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='*'){
                if(res.length()>=1){
                res.deleteCharAt(res.length()-1);
                }
            }
            else if(i=='#'){
                if(res.length()>=1){
                res.append(res);
                }
            }
            else if(i=='%'){
                res.reverse();
            }
            else{
                res.append(i);
            }
            System.out.println(res);
        }
        return res.toString();
        
    }
}