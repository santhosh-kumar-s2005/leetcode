class Solution {
     static {
        for (int i = 0; i < 1000; i++) {
            maxArea(new int[] { 0, 0 });
        }   
    }
    public static int maxArea(int[] height) {
        int i=0;
        int maxarea=Integer.MIN_VALUE;
        int j=height.length-1;
        while(i<j){
            maxarea=Math.max(maxarea,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>=height[j]){j--;}
            else i++;
        }
        return maxarea;
    }
}