class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String i:queries){
            for(String j:dictionary){
                int diff=count(i,j);
                if(diff<=2){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
    public static int count(String i,String j){
        int n=i.length();
        int diff=0;
        for(int ptr=0;ptr<n;ptr++){
            if(i.charAt(ptr)!=j.charAt(ptr)){
                diff++;
            }
        }
        return diff;
    }
}