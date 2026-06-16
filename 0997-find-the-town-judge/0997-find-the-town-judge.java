class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }

        ArrayList<Integer> truster=new ArrayList<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i[]:trust){
            truster.add(i[0]);
            map.put(i[1],map.getOrDefault(i[1],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==n-1 && !truster.contains(i)){
                return i;
            }
        }
        return -1;
    }
}