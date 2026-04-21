class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int steps=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
            steps=Math.min(steps,Math.min(Math.abs(i-startIndex),n-Math.abs(i-startIndex)));
            }
        }
        return steps==Integer.MAX_VALUE?-1:steps;


 
 
    }
}