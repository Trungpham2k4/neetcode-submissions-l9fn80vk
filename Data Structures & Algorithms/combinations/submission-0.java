class Solution {
    private int[] arr = new int[100];
    private List<List<Integer>> list = new ArrayList<>();

    public void backtrack(int n, int k, int i, List<Integer> accumulate){
        for(int start = arr[i-1] + 1; start <= n - k + i; start++){
            arr[i] = start;
            accumulate.add(start);
            if(i == k){
                List<Integer> copy = new ArrayList<>(accumulate);
                list.add(copy);
            }else{
                backtrack(n,k,i+1,accumulate);
            }
            accumulate.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        // Tổ hợp chập k của n
        ArrayList<Integer> l = new ArrayList<>();
        backtrack(n,k,1,l);
        return list;
    }
}