class Solution {

    public boolean canReach(int[] arr, int start) {

        if(start < 0 || start >= arr.length || arr[start] < 0){
            return false;
        }

        if(arr[start] == 0){
            return true;
        }

        int jump = arr[start];

    
        arr[start] = -arr[start];

        return ((start+jump<arr.length)?canReach(arr, start + jump):false )||((start-jump>=0)?canReach(arr, start - jump):false);
    }
}