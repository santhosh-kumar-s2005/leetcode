class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String i:queries){
            for(String j:dictionary){
                if(count(i,j)){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
    public static boolean count(String i,String j){
        int n=i.length();
        int diff=0;
        for(int ptr=0;ptr<n;ptr++){
            if(i.charAt(ptr)!=j.charAt(ptr)){
                diff++;
            }
              if(diff>2) return false;
        }
        return true;
    }
}