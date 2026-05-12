class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int maxarea=Integer.MIN_VALUE;
        int j=height.length-1;
        while(i<j){
            if(height[i]>height[j]){
                maxarea=Math.max(maxarea,(j-i)*height[j]);
                j--;
            }
            else if(height[i]<height[j]){
                maxarea=Math.max(maxarea,(j-i)*height[i]);
                i++;
            }
            else{
                maxarea=Math.max(maxarea,(j-i)*height[i]);
                i++;
            }

        }
        return maxarea;
    }
}