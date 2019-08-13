/**
 * ArrayStack.java
 *
 * 
 * COMP 2231 Assignment 2 Question 1
 * 
 * An array implementation of a stack in which the  
 * bottom of the stack is fixed at index -1 
 */
package assignment_2a;

import java.util.Arrays;

import jsjf.StackADT;
import jsjf.exceptions.EmptyCollectionException;

public class ArrayStack<T> implements StackADT<T> 
{
    private final static int DEFAULT_CAPACITY = 10;//stacks starting capacity
    private final static int EMPTY = -1;//empty stack size
    
    private int top;//stack top
    private T[] stack;//array containing stack   
    
    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }//end ArrayStack

    /**
     * Creates an empty stack using the specified capacity.
     * @param initialCapacity the initial size of the array
     */
    public ArrayStack(int initialCapacity)
    {	
        top = EMPTY;//pointing at empty stack
        stack = (T[])(new Object[initialCapacity]);
    }//end ArrayStack
        
    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     * @param element generic element to be pushed onto stack
     */
//    @Override
    public void push(T element)
    {
        if(size() == stack.length)
            expandCapacity();
        
        top++;
        stack[top] = element;//top now new element
    }//end push

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
        stack = Arrays.copyOf(stack, stack.length*2);
    }//end expandCapacity
    
    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
//    @Override
    public T pop() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        T temp = stack[top];//element to top
        stack[top] = null;//top index set to null
        top--;

        return temp;
    }//end pop

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
//        @Override
    public T peek() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top];//returns current top
    }//end peek

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if this stack is empty
     */
//    @Override
    public boolean isEmpty()
    {
        return (size() == 0);
    }//end isEmpty

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
//        @Override
    public int size()
    {
        int count = 0;
        for (int i = 0; i>stack.length; i++)
            count ++;
        return count;
    }//end size

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
//        @Override
    public String toString() 
    {	
        String output = "";
        if(size() == 0)
        {//if empty stack
            System.out.println("The stack is empty");
        }
        else
        {//if not empty
            for(int i=top; i >= 0; i--)
            {//allowing for ouput of stack elements
                output += stack[i] + "\n";
            }//end for
        }
        return output;
    }//end toString
    
}//end ArrayStack Class

/*
Assistance from ArrayStack source code
Assistance from chapter 12 Introduction to Collections—Stacks
*/



