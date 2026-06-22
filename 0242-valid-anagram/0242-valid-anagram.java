class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)-1);
        }
        int count=0;
        for(char i:map.keySet()){
            if(map.get(i)!=0) count++;
           
        }
        return count==0;
        
    }
}