class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowel="aeiouAEIOU";
        while(i<j){
            if(vowel.indexOf(arr[i])!=-1){
                if(vowel.indexOf(arr[j])!=-1){
                    char t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
            i++;
            }
        }
        return new String(arr);
        
    }
}