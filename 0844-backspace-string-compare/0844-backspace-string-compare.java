class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        for(char i:s.toCharArray()){
            if(i!='#') s1.push(i);
            else{
                if(!s1.isEmpty()) s1.pop();
            }
        }
        Stack<Character> s2=new Stack<>();
        for(char i:t.toCharArray()){
            if(i!='#') s2.push(i);
            else{
                if(!s2.isEmpty()) s2.pop();
            }
        }
        if(s1.size() !=s2.size()) return false;
        while(!s1.isEmpty()){
            if(s2.pop()!=s1.pop()){
                return false;
            }
        }
        return true;
    }
}
