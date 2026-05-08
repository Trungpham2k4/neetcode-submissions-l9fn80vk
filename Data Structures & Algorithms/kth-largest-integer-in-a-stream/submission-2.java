class KthLargest {

    private Queue<Integer> q;
    private int order;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        order = k;
        Arrays.sort(nums);
        for(int i = nums.length-1; i >= 0; i--){
            q.add(nums[i]);
            k--;
            if(k == 0) break;
        }
    }
    
    public int add(int val) {
        if(q.size() < order){
            q.add(val);
            return q.peek();
        }
        int smallest = q.peek();
        if (val > smallest){
            q.poll();
            q.add(val);
        }
        return q.peek();
    }
}
