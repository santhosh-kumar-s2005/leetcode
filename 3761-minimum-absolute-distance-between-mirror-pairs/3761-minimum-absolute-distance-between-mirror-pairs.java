class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr=0;
            while(nums[i]>0){
                curr=curr*10+nums[i]%10;
                nums[i]/=10;
            }
            if(map.containsKey(curr))
            {
                for(int j:map.get(curr)){
                    if(i<j){
                        min=Math.min(min,Math.abs(j-i));
                        
                        if(min==1) return min; 
                    }
                }
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
        
    }
}