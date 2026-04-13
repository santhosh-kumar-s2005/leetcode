class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int x=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
              map.get(nums[i]).add(i);
            }
            else{
                int idx=i;
                map.put(nums[i],new ArrayList<>(){{add(idx);}});
            }
            int si=map.get(nums[i]).size();
            if(si>=3){
                x=Math.min(x,(map.get(nums[i]).get(si-1)-map.get(nums[i]).get(si-3))*2);
            }
        }



        return x==Integer.MAX_VALUE?-1:x;
        
    }
}