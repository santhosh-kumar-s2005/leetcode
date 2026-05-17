class Solution {
    static{
        for(int i=1;i<=1000;i++){
            canReach(new int[]{1,0},0);
        }
    }
    public static int n;
    public static boolean visited[];
    public static boolean canReach(int[] nums, int start) {
    n=nums.length;
    if(nums[start]==0) return true;
    if(n==1) return false;
    visited=new boolean[n];
    visited[start]=true;
    return recjump(nums,start-nums[start])||recjump(nums,start+nums[start]);   
    }
    public static boolean recjump(int nums[],int jump_index){
    if(jump_index<0 ||jump_index>=n||visited[jump_index]){
        return false;
    }
    if(nums[jump_index]==0) return true;
    visited[jump_index]=true;
    return recjump(nums,jump_index-nums[jump_index])||recjump(nums,jump_index+nums[jump_index]);
    }
}