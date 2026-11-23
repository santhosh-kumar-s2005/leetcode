class ProductOfNumbers {
    ArrayList<Integer> dp;

    public ProductOfNumbers() {
        dp=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            this.dp=new ArrayList<>();
            return;
        }
        if(dp.size()==0){
            dp.add(num);
            return;
        }
        dp.add(num*dp.get(dp.size()-1));
    }
    
    public int getProduct(int k) {
        int size=dp.size();
        if(size-k<0){
            return 0;
        }
        int divisor=(size-k-1>=0)?dp.get(size-k-1):1;
        return dp.get(size-1)/(divisor);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */