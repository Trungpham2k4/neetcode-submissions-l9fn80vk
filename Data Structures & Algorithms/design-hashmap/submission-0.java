class MyHashMap {

    private int[] map;

    public MyHashMap() {
        map = new int[10000001];
        Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
        map[hash(key)] = value;
    }
    private int hash(int key){
        return key % map.length;
    }
    
    public int get(int key) {
        return map[hash(key)];
    }
    
    public void remove(int key) {
        map[hash(key)] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */