class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
           
                result.add(candies[i]+extraCandies>=max);
            
        }
        return result;
    }
}