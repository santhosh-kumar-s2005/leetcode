class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score){
            heap.add(i);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        while(!heap.isEmpty()){
            map.put(heap.poll(),rank++);
        }
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            if(map.get(score[i])==1){
                res[i]="Gold Medal";
            }
            else if(map.get(score[i])==2){
                res[i]="Silver Medal";
            }
            else if(map.get(score[i])==3){
                res[i]="Bronze Medal";
            }
            else {
                res[i]=""+map.get(score[i]);
            }
        }
        return res;

        
    }
}