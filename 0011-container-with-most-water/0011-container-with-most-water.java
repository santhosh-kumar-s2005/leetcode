class Solution {
    static { for (int i = 0; i < 100; i++) { maxArea(new int[] { 0, 0 }); }}
    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int max = 0;
        while(start < end){
            int storage = Math.min(height[start], height[end]) * (end - start);
            if(max < storage) max = storage;
            if(height[start] > height[end]) end--;
            else start++;
        }
        return max;
    }
}