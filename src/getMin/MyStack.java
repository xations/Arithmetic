package getMin;

import java.util.Stack;

public class MyStack {
    private Stack<Integer> stackMin;
    private Stack<Integer> stackData;

    public MyStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("The stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin() {
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("The stack is empty");
        }
        return this.stackMin.peek();
    }
}
