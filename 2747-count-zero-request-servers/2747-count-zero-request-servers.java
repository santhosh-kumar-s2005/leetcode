// class Solution {
//     public int[] countServers(int n, int[][] logs, int x, int[] queries) {
//         HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
//         for(int i[]:logs){
//             map.putIfAbsent(i[0],new ArrayList<>());
//             map.get(i[0]).add(i[1]);
//         }
//         for(int i:map.keySet()){
//             Collections.sort(map.get(i));
//         }

//         for(int i=0;i<queries.length;i++){
//            int count=n;
//             for(int j:map.keySet()){
//             if(binarysearch(map.get(j),queries[i]-x,queries[i])){
//                 count--;
//             }
       
//             }
//         // for(int j[]:logs){
//         //     if(j[1]>=queries[i]-x && j[1]<=queries[i])
//         //     {
//         //         continue;
//         //     }
//         //     count++;

//         // }
//             queries[i]=count;

//         }
//         return queries;

        
//     }
//     public static boolean binarysearch(ArrayList<Integer> arr,int low,int up){
//         int left=0;
//         int right=arr.size()-1;
//         while(left<=right){
//             int mid=(left+right)/2;
//             if(low<=arr.get(mid) && arr.get(mid)<=up){
//                 return true;
//             }
//             else if(arr.get(mid)<low){
//                 left=mid+1;
//             }
//             else{
//                 right=mid-1;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        Integer[] idx = new Integer[queries.length];

        for (int i = 0; i < queries.length; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> queries[a] - queries[b]);

        int[] ans = new int[queries.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int active = 0;

        for (int i : idx) {

            int q = queries[i];

            // Add logs inside the window
            while (right < logs.length && logs[right][1] <= q) {

                int server = logs[right][0];

                map.put(server, map.getOrDefault(server, 0) + 1);

                if (map.get(server) == 1) {
                    active++;
                }

                right++;
            }

            // Remove logs outside the window
            while (left < right && logs[left][1] < q - x) {

                int server = logs[left][0];

                map.put(server, map.get(server) - 1);

                if (map.get(server) == 0) {
                    active--;
                }

                left++;
            }

            ans[i] = n - active;
        }

        return ans;
    }
}