class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> entry1, Map.Entry<Integer,Integer> entry2 ){
                return entry2.getValue() - entry1.getValue();
            }
        });
        int[] res = new int[k];
        int idx = 0;
        while(k-- != 0){
            res[idx] = list.get(idx).getKey();
            idx++;
        }         
        return res;
    }
}
