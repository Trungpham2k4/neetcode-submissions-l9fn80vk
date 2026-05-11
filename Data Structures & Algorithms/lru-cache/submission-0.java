class LRUCache {

    private int capacity;
    private LinkedList<Integer> list;
    private HashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            // update position 
            int idx = list.indexOf(key);
            Integer removeKey = list.remove(idx);
            list.addFirst(Integer.valueOf(key));
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            int idx = list.indexOf(key);
            map.put(key,value);
            list.remove(idx);
            list.addFirst(Integer.valueOf(key));
        }else{
            if(list.size() == capacity){
                int oldkey = list.removeLast();
                map.remove(oldkey);
            }
            list.addFirst(key);
            map.put(key,value);
        }
    }
}
