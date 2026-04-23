// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         HashSet<Character> set=new HashSet<>();
//         for(char i:allowed.toCharArray()){
//             set.add(i);
//         }
//         int count=0;
//         for(String i:words){
//             boolean found=true;
//             for(char j:i.toCharArray()){
//                 if(!set.contains(j)){
//                     found=false;
//                     break;

//                 }
//             }
//             if(found){
//                 count++;
//             }
//         }
//         return count;
//     }

// }
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;

        for (char ch : allowed.toCharArray()) {
            mask |= (1 << (ch - 'a'));
        }

        int count = 0;

        for (String word : words) {
            boolean ok = true;

            for (char ch : word.toCharArray()) {
                if ((mask & (1 << (ch - 'a'))) == 0) {
                    ok = false;
                    break;
                }
            }

            if (ok) count++;
        }

        return count;
    }
}