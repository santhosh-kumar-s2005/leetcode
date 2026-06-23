class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<int[]> result =new ArrayList<>();
        for(int i:map.keySet()){
            result.add(new int[]{i,map.get(i)});
        }
        int arr[]=new int[k];
        Collections.sort(result,(a,b)->b[1]-a[1]);
        for(int i=0;i<k;i++){
            arr[i]=result.get(i)[0];
        }
        return arr;


    }
}