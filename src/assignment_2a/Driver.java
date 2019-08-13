/**
 * ArrayStackDriver.java
 *
 * 
 * COMP 2231 Assignment 2 Question 1 
 */
package assignment_2a;

import jsjf.exceptions.EmptyCollectionException;

public class Driver 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayStack<Integer> stackTest1 = new ArrayStack<>(6);
        ArrayStack<Integer> stackTest2 = new ArrayStack<>(4);
        
        System.out.println("=================================");
        System.out.println("           EMPTY STACK           ");
        System.out.println("=================================");
	System.out.println("size of stack is " + stackTest1.size());
        System.out.println("is the stack empty: " + stackTest1.isEmpty());
        System.out.println("Stack:");
	System.out.println(stackTest1);
        
	System.out.println("---------Pop empty stack---------");
        try 
        {
            stackTest1.pop();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
        
	System.out.println("--------Peek empty stack---------");
        try 
        {
            stackTest1.peek();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();

        System.out.println("=================================");
        System.out.println("              STACK              ");
	System.out.println("=================================");
        
        System.out.println("------------Stack 1-------------");
        System.out.println("----------Making stack----------");
        System.out.println("Push 1");
	stackTest1.push(1);
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();

	System.out.println("Push 2");
	stackTest1.push(2);
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();

        System.out.println("Push 3");
	stackTest1.push(3);
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();
        
        System.out.println("Push 4");
	stackTest1.push(4);
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();
        
        System.out.println("Push 5");
	stackTest1.push(5);
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();

	System.out.println("---------Checking stack----------");
	System.out.println("size of stack is " + stackTest1.size());
        System.out.println("is the stack empty: " + stackTest1.isEmpty());
	System.out.println();
        
        System.out.println("Peek from stack");
	System.out.println("Peeked: " + stackTest1.peek());
	System.out.println();
        
        System.out.println("Pop from stack");
	System.out.println("Popped: " + stackTest1.pop());
	System.out.println("Stack:");
	System.out.println(stackTest1);
	System.out.println();
        
        System.out.println("------------Stack 2-------------");
        System.out.println("----------Making stack----------");
        
	System.out.println("push 2,4,6,8,10,12,14(exceed capacity)");
	stackTest2.push(2);
	stackTest2.push(4);
	stackTest2.push(6);
        stackTest2.push(8);
        stackTest2.push(10);
        stackTest2.push(12);
        stackTest2.push(14);
	System.out.println("Stack:");
	System.out.println(stackTest2);
	System.out.println();
        
        System.out.println("---------Checking stack----------");
	System.out.println("Peek from stack");
	System.out.println("Peeked:" + stackTest2.peek());
	System.out.println("Stack:");
	System.out.println(stackTest2);
	System.out.println();

	System.out.println("Pop from stack ");
	System.out.println("Popped:" + stackTest2.pop());
	System.out.println("Stack:");
	System.out.println(stackTest2);
	System.out.println();
        
        System.out.println("size of stack is " + stackTest2.size());
        System.out.println("is the stack empty: " + stackTest2.isEmpty());
	System.out.println();
    }//end main
    
}//end Driver   

