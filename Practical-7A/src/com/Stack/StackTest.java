package com.Stack;
public class StackTest {
    public static void main(String[] args) {
        // Test ArrayStack with Integer
        Stack<Integer> arrayStack = new ArrayStack<>();
        System.out.println("Testing ArrayStack with Integer:");
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println("Top element: " + arrayStack.peek()); // Output: 3
        System.out.println("Popped element: " + arrayStack.pop()); // Output: 3
        System.out.println("Top element after pop: " + arrayStack.peek()); // Output: 2

        // Test LinkedListStack with String
        Stack<String> linkedListStack = new LinkedListStack<>();
        System.out.println("\nTesting LinkedListStack with String:");
        linkedListStack.push("Balaji");
        linkedListStack.push("Sai");
        linkedListStack.push("Bhaavan");
        System.out.println("Top element: " + linkedListStack.peek()); // Output: C
        System.out.println("Popped element: " + linkedListStack.pop()); // Output: C
        System.out.println("Top element after pop: " + linkedListStack.peek()); // Output: B

        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStackInt = new LinkedListStack<>();
        System.out.println("\nTesting LinkedListStack with Integer:");
        linkedListStackInt.push(30016);
        linkedListStackInt.push(30123);
        linkedListStackInt.push(33454);
        System.out.println("Top element: " + linkedListStackInt.peek()); // Output: 30
        System.out.println("Popped element: " + linkedListStackInt.pop()); // Output: 30
        System.out.println("Top element after pop: " + linkedListStackInt.peek()); // Output: 20
    }
}
