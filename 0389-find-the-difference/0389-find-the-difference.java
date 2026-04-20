// class Solution {
//     public char findTheDifference(String s, String t) {
//         int sbyte=0;
//         int tbyte=0;
//         for(char i:s.toCharArray()){
//             sbyte+=i;
//         }
//          for(char i:t.toCharArray()){
//             tbyte+=i;
//         }
//         tbyte=tbyte-sbyte;
//         return ((char)tbyte);
//     }
// }
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;

        for(char c : s.toCharArray()) res ^= c;
        for(char c : t.toCharArray()) res ^= c;

        return res;
    }
}