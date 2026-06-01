// class Solution {
//     public boolean backspaceCompare(String s, String t) {
    class Solution {

    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {

                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                }

                else if (skipS > 0) {
                    skipS--;
                    i--;
                }

                else {
                    break;
                }
            }

            while (j >= 0) {

                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                }

                else if (skipT > 0) {
                    skipT--;
                    j--;
                }

                else {
                    break;
                }
            }

            if (i >= 0 && j >= 0 &&
                s.charAt(i) != t.charAt(j)) {

                return false;
            }

            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
}












        // Stack<Character> s1=new Stack<>();
        // for(char i:s.toCharArray()){
        //     if(i!='#') s1.push(i);
        //     else{
        //         if(!s1.isEmpty()) s1.pop();
        //     }
        // }
        // Stack<Character> s2=new Stack<>();
        // for(char i:t.toCharArray()){
        //     if(i!='#') s2.push(i);
        //     else{
        //         if(!s2.isEmpty()) s2.pop();
        //     }
        // }
        // if(s1.size() !=s2.size()) return false;
        // while(!s1.isEmpty()){
        //     if(s2.pop()!=s1.pop()){
        //         return false;
        //     }
        // }
//         // return true;
//     }
// }
