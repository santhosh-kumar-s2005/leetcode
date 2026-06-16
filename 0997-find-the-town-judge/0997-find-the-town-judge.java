class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }

        ArrayList<Integer> truster=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
        for(int i[]:trust){
            truster.add(i[0]);
            if(map.containsKey(i[1])){
                map.get(i[1]).add(i[0]);
            }else{
                map.put(i[1],new ArrayList<>());
                map.get(i[1]).add(i[0]);
            }
           // map.put(i[1],map.getOrDefault(i[1],new ArrayList<>())).add(i[0]);
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