package collections;

import java.util.Stack;

public class StackExample {
    static void abc1() {
        System.out.println("abc1 starts");
    }
    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
    }
    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        start();
    }

    static void start() {
        Stack<String> stack = new Stack<>();
        stack.push("Vit");
        stack.push("Zaur");
        stack.push("Oleg");
        System.out.println(stack);
        System.out.println(stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
