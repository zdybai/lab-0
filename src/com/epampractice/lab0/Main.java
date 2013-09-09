package com.epampractice.lab0;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.push(23);
            stack.push(34);
            stack.push(45);
            stack.push(56);
            stack.push(67);
            System.out.println("Get number from stack = " + stack.pop());
            System.out.println("Get number from stack = " + stack.pop());
            System.out.println("Get number from stack = " + stack.pop());
            System.out.println("Get number from stack = " + stack.pop());
        } catch (StackOverflowException e) {
            System.out.println("Stack overflow!");
        } catch (EmptyStackException ese) {
            System.out.println("Stack is empty!");
        }
    }
}
