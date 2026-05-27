// class Solution {
//     public int numberOfSpecialChars(String word) {
//     int low[]=new int[26];
//     int upp[]=new int[26];
//     Arrays.fill(upp,-1);
//      Arrays.fill(low,-1);
//     for(int i=0;i<word.length();i++){
//          int pos=word.charAt(i)-'a';
//         if(Character.isLowerCase(word.charAt(i))){
//             low[pos]=i;
//         }
//         else{
//             pos=word.charAt(i)-'A';
//             if(upp[pos]==-1){
//                 upp[pos]=i;
//             }
//         }
//     }
 
//     int count=0;
//     for(int i=0;i<=25;i++){
//         if(upp[i]!=-1 && low[i]!=-1 && upp[i]>low[i]){
//             count++;
//         }
//     }
//     return count;    
//     }
// }
class Solution {
    public int numberOfSpecialChars(String word) {
		int n = word.length();
		char[] chars = word.toCharArray();
		int[] lastLower = new int[26];
		int[] firstUpper = new int[26];
		Arrays.fill(lastLower, -1);
		Arrays.fill(firstUpper, -1);
		for (int i = 0; i < n; i++) {
			if (chars[i] >= 'a') {
				lastLower[chars[i] - 'a'] = i;
			} else if (firstUpper[chars[i] - 'A'] == -1) {
				firstUpper[chars[i] - 'A'] = i;
			}
		}
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			if (lastLower[i] != -1 && lastLower[i] < firstUpper[i]) {
				ans++;
			}
		}
		return ans;
	}
}