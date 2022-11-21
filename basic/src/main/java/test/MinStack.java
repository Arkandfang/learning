package test;

import java.util.Stack;

/**
 * @author fangzhou
 * @date 2022-11-18 23:02
 */
public class MinStack {

    private Stack<Integer> main;
    private Stack<Integer> help;

    /** initialize your data structure here. */
    public MinStack() {
        main = new Stack<Integer>();
        help = new Stack<Integer>();
        help.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        main.push(x);
      //  if(help.isEmpty()){
        //    help.push(x);
        //}
        if(x <= help.peek()){
            help.push(x);
        }
    }

    public void pop() {
        int head = main.pop();
        if(head  == help.peek()){
            help.pop();
        }
    }

    public int top() {
        return  main.peek();
    }

    public int min() {
        return help.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.min();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.min();
        minStack.push(-2147483648);
        minStack.top();
        minStack.min();
        minStack.pop();
        minStack.min();


    }
}
