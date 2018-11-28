package sortstack;

import java.util.Stack;

public class SortStackWithStack {

    public static void sortStackBySatck(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (! stack.isEmpty()) {
            int cur = stack.pop();

            while (! help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (! help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
