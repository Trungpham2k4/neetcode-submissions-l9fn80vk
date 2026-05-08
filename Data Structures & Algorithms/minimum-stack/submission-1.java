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
            if(val <= min.peek()){
                min.push(val);
            }
        }
    }
    
    public void pop() {
        int val = main.pop();
        if(val == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
