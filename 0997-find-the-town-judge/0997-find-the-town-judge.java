class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }

        ArrayList<Integer> truster=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
        for(int i[]:trust){
            truster.add(i[0]);
            map.computeIfAbsent(i[1], k -> new ArrayList<>()).add(i[0]);
        }
      

        
        for(int i:map.keySet()){
            if(map.get(i).size()==n-1 && !truster.contains
            (i)){
                return i;
            }
        }
        return -1;
    }
}