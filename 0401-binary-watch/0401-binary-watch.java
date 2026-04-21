// class Solution {
//     public List<String> readBinaryWatch(int turnedOn) {
//         List<String> res =new ArrayList<>();
//         if(turnedOn==0){
//             res.add("0:00");
//             return res;
//         }
//         int[] dp = new int[1024];
        
//         for(int i = 1; i <= 1023; i++){
//             dp[i] = dp[i & (i - 1)] + 1;
//             if(dp[i]==turnedOn){
//                 int n=i;
//                 int hour=((n&960)>>6);
//                 int minute=((n&63));
//                 if(hour>11 || minute>59){
//                     continue;
//                 }
//                 else{
//                     res.add(""+hour+":"+((minute<10)?"0"+minute:""+minute));
//                 }
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        for (int hour = 0; hour < 12; hour++) {
            
            for (int minute = 0; minute < 60; minute++) {
                
                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);
                
                if (totalBits == turnedOn) {
                    
                    String time = hour + ":" + 
                                  (minute < 10 ? "0" + minute : minute);
                    
                    result.add(time);
                }
            }
        }
        
        return result;
    }
}