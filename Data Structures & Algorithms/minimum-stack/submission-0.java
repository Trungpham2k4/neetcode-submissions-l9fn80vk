class MinStack {

    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            int size = min.size();
            List<Integer> temp = new ArrayList<>();
            while(!min.isEmpty() && val > min.peek()){
                temp.add(min.pop());
            }
            min.push(val);
            for(int i = temp.size() - 1; i >= 0; i--){
                min.push(temp.get(i));
            }
        }
    }
    
    public void pop() {
        int val = main.pop();
        List<Integer> temp = new ArrayList<>();
        while(val != min.peek()){
            temp.add(min.pop());
        }
        min.pop();
        for(int i = temp.size() - 1; i >= 0; i--){
            min.push(temp.get(i));
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
