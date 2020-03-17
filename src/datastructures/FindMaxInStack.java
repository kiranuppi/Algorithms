package datastructures;

import java.util.Stack;

public class FindMaxInStack {

    static class MyStack {
        Stack<Integer> stk = new Stack<>();

        int maxElement;

        void getMax() {
            if (stk.empty()) {
                System.out.println("Stack in Empty");

            } else {
                System.out.println("Max element in the Stack is" + maxElement);
            }
        }

        void peek() {
            if (stk.empty()) {
                System.out.println("Stack in Empty");
                return;

            }

            int top = stk.peek();
            if (top > maxElement)
                System.out.print(maxElement);
            else
                System.out.print(top);


        }

        void pop() {

            if (stk.empty()) {
                System.out.println("Stack in Empty");
                return;

            }
            System.out.print("Top Most Element Removed: ");
            int top = stk.peek();
            stk.pop();

            if (top > maxElement) {
                System.out.println("Max Element is :" + maxElement);
                maxElement = 2 * maxElement - top;
            } else {
                System.out.println(top + "\n");
            }

        }

        void push(int x) {
            if (stk.empty()) {
                maxElement = x;
                stk.push(x);
                System.out.println("Number inserted :" + x + "\n");
            }

            if (x > maxElement) {
                stk.push(2 * x - maxElement);
                maxElement = x;
            } else {
                stk.push(x);
                System.out.println("Number inserted :" + x + "\n");
            }
        }
    };

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.push(3);
        stack.push(9);
        stack.getMax();
        stack.pop();
        stack.pop();
        stack.getMax();
        stack.push(7);
        stack.peek();
    }
}

