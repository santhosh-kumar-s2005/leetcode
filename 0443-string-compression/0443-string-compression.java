class Solution {
    public int compress(char[] arr) {
        int index=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            char current=arr[i];
            while(i<n && current==arr[i]){
                count++;
                i++;
            }
            arr[index++]=current;
            if(count>1){
                for(char j:String.valueOf(count).toCharArray()){
                    arr[index++]=j;
                }
            }
            i--;

        }
        return index;
 
    }  
}