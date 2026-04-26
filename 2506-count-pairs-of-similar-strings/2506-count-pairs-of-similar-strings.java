class Solution {
    public int similarPairs(String[] words) {
        int arr[]=new int[words.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int l=words[i].length();
            int res=0;
            for(int j=0;j<l;j++){
                res|=1<<(words[i].charAt(j)-'a');
            }
            arr[i]=res;
        }
        int count=0;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i:arr){
        //     if(!set.add(i)){
        //         count++;
        //     }
        // }
        // return count+1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}