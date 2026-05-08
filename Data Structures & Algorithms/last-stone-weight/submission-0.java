class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> q = new PriorityQueue<>((prev,curr) -> curr - prev);
        for(int stone : stones){
            q.add(stone);
        }
        while(!q.isEmpty()){
            if(q.size() == 1) return q.peek();
            int largest = q.poll();
            int secondLargest = q.poll();
            int remain = Math.abs(largest - secondLargest);
            if(remain != 0){
                q.add(remain);
            }
        }
        return 0;
    }
}
