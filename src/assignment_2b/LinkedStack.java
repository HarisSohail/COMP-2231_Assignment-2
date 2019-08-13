/**
 * LinkedStack.java
 *
 * 
 * COMP 2231 Assignment 2 Question 2
 * 
 * Element is pushed, the bottom element is lost 
 * Implement a drop-out stack using links, 
 * by modifying the LinkedStack code.
 */
package assignment_2b;

import jsjf.LinearNode;
import jsjf.StackADT;
import jsjf.exceptions.EmptyCollectionException;

public class LinkedStack<T> implements StackADT<T>  
{
    private final static int DEFAULT_CAPACITY = 10;

    private int capacity;//capacity fixed
    private int count;//number of elem currently in stack
    private LinearNode<T> top;//top of stack
    private LinearNode<T> bottom;//end of stack

    /**
     * Creates an empty stack using the default capacity.
     */
    public LinkedStack()
    {
        this(DEFAULT_CAPACITY);
    }//end LinkedDropOutStack
    
    /**
     * Creates an empty stack using the specified capacity.
     * @param initialCapacity the initial size of the array
     */
    public LinkedStack(int initialCapacity)
    {
        this.capacity = initialCapacity;//set capacity
        count = 0;//set to 0
        top = bottom = null;//set to null
    }//end LinkedDropOutStack

    /**
     * Adds the specified element to the stack
     * @param element generic element to be pushed onto stack
     */
//    @Override
    public void push(T element)
    {
        if(size() == capacity)
        {//drop out occurs if full stack
            LinearNode<T> current = top;//current elem is now top of stack
            
            for(int i=2; i < count; i++)
            {//move through list
                current = current.getNext();//moves through
            }//end for
            current.setNext(null);//last node pointer now null
            count--;
        }//end 
        
	LinearNode<T> temp = new LinearNode<>(element);

	temp.setNext(top);
	top = temp;
	count++;
    }//end push

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
        
        T temp = top.getElement();
        top = top.getNext();//set top to next elem
        count--;
        if(isEmpty())
        {
            bottom = null;
        }//end if
        return temp;
    }//end pop

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
//    @Override	
    public T peek() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        return top.getElement();
    }//end peek

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if this stack is empty
     */
//    @Override
    public boolean isEmpty() 
    {
        return(count == 0);
    }//end isEmpty
   
    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
//    @Override
    public int size()
    {
	return count;
    }//end size

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
//    @Override
    public String toString()
    {
        LinearNode<T> current = top;

	String output = "";
            if(size() == 0)
        {
            System.out.println("The stack is empty");
        }//end if
        else
        {	
            while(current != null)
            {
                output += current.getElement() + "\n";
                current = current.getNext();
            }//end while
        }//end else
	return output;
    }//end toString
    
}//end LinkedStack Class

/*
Assistance from LinkedStack source code
Assistance from Chapter 13 Linked Structures—Stacks
*/