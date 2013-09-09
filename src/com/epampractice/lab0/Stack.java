package com.epampractice.lab0;

import java.util.EmptyStackException;

public class Stack {
    private static final int STACK_SIZE = 5;
    private int pointer;
    private int[] arr;

    public Stack() {
        arr = new int[STACK_SIZE];
        pointer = -1;
    }

    public void push(int value) throws StackOverflowException {
        if(pointer < STACK_SIZE - 1) {
            pointer++;
            arr[pointer] = value;
        } else {
            throw new StackOverflowException("Stack Overflow! You have only five elements");
        }
    }

    public int pop(){
        int value;
        if(pointer >= 0) {
            value = arr[pointer];
            pointer--;
        } else {
            throw new EmptyStackException();
        }
        return value;
    }
}
