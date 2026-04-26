// class Solution {
//     public int similarPairs(String[] words) {
//         int arr[]=new int[words.length];
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             int l=words[i].length();
//             int res=0;
//             for(int j=0;j<l;j++){
//                 res|=1<<(words[i].charAt(j)-'a');
//             }
//             arr[i]=res;
//         }
//         int count=0;
//         // HashSet<Integer> set=new HashSet<>();
//         // for(int i:arr){
//         //     if(!set.add(i)){
//         //         count++;
//         //     }
//         // }
//         // return count+1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int similarPairs(String[] words) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (String word : words) {

            int mask = 0;

            for (char ch : word.toCharArray()) {
                mask |= 1 << (ch - 'a');
            }

            count += map.getOrDefault(mask, 0);

            map.put(mask, map.getOrDefault(mask, 0) + 1);
        }

        return count;
    }
}