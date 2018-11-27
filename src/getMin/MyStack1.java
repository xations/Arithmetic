package getMin;

import java.util.Stack;

public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.empty()){
            this.stackMin.push(newNum);
        }else if(newNum< this.getmin()){
            this.stackMin.push(newNum);
        }else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()){
            throw new RuntimeException("The stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getmin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("The stack is empty");
        }
        return this.stackMin.peek(); //peek方法 返回栈顶元素
    }
}
