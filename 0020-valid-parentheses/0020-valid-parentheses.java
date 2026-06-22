class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
       Stack<Character> stack=new Stack<>();
       for(char i:s.toCharArray()){
        if(i=='('||i=='['||i=='{'){
            stack.push(i);
        }
        else{
            if(stack.isEmpty()) return false;
            if((stack.peek()=='(' && i!=')')||(stack.peek()=='[' && i!=']')||(stack.peek()=='{' && i!='}')){
                return false;
            }
            stack.pop();
            
        }
       }
       return stack.isEmpty();
        
    }
}