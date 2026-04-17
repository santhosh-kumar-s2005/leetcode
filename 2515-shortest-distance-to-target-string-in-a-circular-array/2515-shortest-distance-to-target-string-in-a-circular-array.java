class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        ArrayList<Integer> arr=new ArrayList<>();
        int j=0;
        for(String i:words){
            if(i.equals(target)){
                arr.add(j);
            }
            j++;
        }
        if(arr.isEmpty()){
            return -1;
        }
        int steps=Integer.MAX_VALUE;
        int n=words.length;
        for(int i:arr){
            steps=Math.min(steps,Math.min(Math.abs(i-startIndex),n-Math.abs(i-startIndex)));
        }
        return steps;


 
 
    }
}