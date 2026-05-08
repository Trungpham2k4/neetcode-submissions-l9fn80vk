class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> val = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                switch (tokens[i]) {
                    case "+" -> {
                        int val1 = val.pop();
                        int val2 = val.pop();
                        val.push(val1 + val2);
                    }
                    case "-" -> {
                        int val1 = val.pop();
                        int val2 = val.pop();
                        val.push(val2 - val1);
                    }
                    case "*" -> {
                        int val1 = val.pop();
                        int val2 = val.pop();
                        val.push(val1 * val2);
                    }
                    case "/" -> {
                        int val1 = val.pop();
                        int val2 = val.pop();
                        val.push(val2 / val1);
                    }
                }
            }else{
                val.push(Integer.valueOf(tokens[i]));
            }
        }
        return val.peek();
    }
}
