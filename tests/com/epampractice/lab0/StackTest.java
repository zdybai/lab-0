package com.epampractice.lab0;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;


public class StackTest{

    private Stack stack;
    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void checkEmptyStackException() throws StackOverflowException{
        exception.expect(EmptyStackException.class);
        stack.pop();
        stack.push(1);
        stack.pop();
        exception.expect(EmptyStackException.class);
        stack.pop();
    }

    @Test
    public void checkStackOverflowException() throws StackOverflowException {
        stack = new Stack();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        exception.expect(StackOverflowException.class);
        stack.push(5);
    }

    @Test
    public void testStackWork() throws StackOverflowException {
        stack = new Stack();
        stack.push(1);
        int value = stack.pop();
        assertEquals(value, 1);
        stack.push(2);
        stack.push(3);
        value = stack.pop();
        assertEquals(value, 3);
        value = stack.pop();
        assertEquals(value, 2);
    }
}