class KthLargest {

  PriorityQueue<Integer> heap=new PriorityQueue<>();
  int k;
    public KthLargest(int k, int[] nums) {
        for(int i:nums){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            }
        }
        this.k=k;
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
        
    }
   
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */