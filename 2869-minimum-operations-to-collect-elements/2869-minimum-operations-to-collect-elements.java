// class Solution {
//     public int minOperations(List<Integer> nums, int k) {
//         HashSet<Integer> set=new HashSet<>();
//         int op=0;
//         for(int i=nums.size()-1;i>=0;i--){
//             op++;
//             if(nums.get(i)>k) continue;
//             set.add(nums.get(i));
//             if(set.size()==k){
//                 break;
//             }
//         }
//         return op;
 

 
//     }
// }    
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int countK = 0, size = nums.size();
        boolean[] seen = new boolean[k + 1];

        for (int i = size - 1; i >= 0; i--) {
            int val = nums.get(i);

            if (val <= k && !seen[val]) {
                seen[val] = true;
                countK++;
            }
            if (countK >= k) return size - i;
        }

        return -1;
    }
}