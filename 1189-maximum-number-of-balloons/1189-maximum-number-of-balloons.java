class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int n=0;
        int l=0;
        int o=0;
        for(char i:text.toCharArray()){
            if(i=='b'){
                b++;
            }
            else if(i=='a'){
                a++;
            }
            else if(i=='n'){
                n++;
            }
            else if(i=='l'){
                l++;
            }
            else if(i=='o'){
                o++;
            }
        }
        return IntStream.of(b,a, n, l/2, o/2).min().getAsInt();

    }
}