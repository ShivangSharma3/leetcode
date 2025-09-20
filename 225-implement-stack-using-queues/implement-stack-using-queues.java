class MyStack {
        private Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int s=q.size();
        for(int i=1;i<s;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        int el=q.peek();
        q.remove();
        return el;
    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */