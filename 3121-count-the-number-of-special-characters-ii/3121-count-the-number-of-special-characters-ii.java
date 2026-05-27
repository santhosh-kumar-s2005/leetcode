class Solution {
    public int numberOfSpecialChars(String word) {
    int low[]=new int[26];
    int upp[]=new int[26];
    Arrays.fill(upp,-1);
     Arrays.fill(low,-1);
    for(int i=0;i<word.length();i++){
         int pos=word.charAt(i)-'a';
        if(Character.isLowerCase(word.charAt(i))){
            low[pos]=i;
        }
        else{
            pos=word.charAt(i)-'A';
            if(upp[pos]==-1){
                upp[pos]=i;
            }
        }
    }
    // System.out.println(Arrays.toString(low));
    // System.out.println(Arrays.toString(upp));
    int count=0;
    for(int i=0;i<=25;i++){
        if(upp[i]!=-1 && low[i]!=-1 && upp[i]>low[i]){
            count++;
        }
            // System.out.println(low[i]);
            //  System.out.println(upp[i]);
    }
    return count;    
    }
}