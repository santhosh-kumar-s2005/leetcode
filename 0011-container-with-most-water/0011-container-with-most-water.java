class Solution {
     
    public static int maxArea(int[] height) {
        int i=0;
        int maxarea=0;
        int j=height.length-1;
        while(i<j){
            maxarea=Math.max(maxarea,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>=height[j]){j--;}
            else i++;
        }
        return maxarea;
    }
}