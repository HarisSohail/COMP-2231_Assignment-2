/**
 * CircularArrayQueue.java
 *
 * 
 * COMP 2231 Assignment 2 Question 1
 * 
 * A deque can insert or remove from either 
 * end of the queue. Implement a deque by modifying 
 * the CircularArrayQueue code.
 */
package assignment_2c;

import jsjf.QueueADT;
import jsjf.exceptions.EmptyCollectionException;

public class CircularArrayQueue<T> implements QueueADT<T>
{   
    private final static int DEFAULT_CAPACITY = 10;

    private int front;//index of the front of the queue
    private int back;//index of the back of the queue
    private int count;
    private T[] queue;//array representation of queue
    
    /**
     * Creates an empty queue using the default capacity.
     */
    public CircularArrayQueue()
    {
	this(DEFAULT_CAPACITY);
    }//end ArrayDeque
    
    /**
     * Creates an empty queue using the specified capacity   
     * @param initialCapacity the size of the array
     */
    public CircularArrayQueue(int initialCapacity)
    {
        count = 0;
	front = back = 0;
	queue = (T[])(new Object[initialCapacity]);
    }//end ArrayDeque

    /**
     * Adds the specified element to the back of this queue, expanding
     * the capacity of the queue array if necessary.
     * @param element the element to add to the back of the queue
     */
    public void enqueue(T element)
    {
	if(size() == queue.length) 
            expandCapacity();

	queue[back] = element;
	back = (back + 1) % queue.length;
	count++;
    }//end enqueue
    
    /**
     * Adds the specified element to the front of this queue, expanding
     * the capacity of the queue array if necessary.
     * @param element the element to add to the back of the queue
     */
    public void enqueueFront(T element)
    {
	if(isEmpty())
        {//if empty stack
            enqueue(element);
        }//end if
        else
        {//if not empty
            if(size() == queue.length) 
                expandCapacity();//expand if required
        
            if(front == 0)
            {//if front is 0
                //adding element at the end of queue bc of circulararray
                front = queue.length - 1;
            }//end if
            else
            {//if not 0
                front--;
            }//end else
            queue[front] = element;
            count++;
        }//end else
    }//end enqueueFront

    /**
     * Creates a new array to store the contents of this queue with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
	T[] expand = (T[]) (new Object[queue.length * 2]);

        for(int scan=0; scan < count; scan++)
	{
            expand[scan] = queue[front];
            front = (front + 1) % queue.length;
	}//end for

	front = 0;
        back = count;
        queue = expand;
    }//end expandCapacity

    /**
     * Removes the element at the front of this queue and returns a
     * reference to it. 
     * @return the element removed from the front of the queue
     * @throws EmptyCollectionException  if the queue is empty
     */
    public T dequeue() throws EmptyCollectionException
    {
	if(isEmpty())
            throw new EmptyCollectionException("queue");

	T result = queue[front];
	queue[front] = null;
	front = (front + 1)%queue.length;

	count--;

	return result;
    }//end dequeue
    
    /**
     * Removes the element at the back of this queue and returns a
     * reference to it. 
     * @return the element removed from the front of the queue
     * @throws EmptyCollectionException  if the queue is empty
     */
    public T dequeueBack() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        
        T result = queue[back - 1];
        //similar to enqueueFront 
        if(back == 0)
        {
            back = queue.length - 1;
        }//end if
        else
        {
            back--;
        }//end else
        queue[back] = null;
        count--;

        return result;
    }//end dequeueBack
    
    /**
     * Returns a reference to the element at the front of this queue.
     * The element is not removed from the queue.
     * @return the first element in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");

        return queue[front];
    }//end first

    /**
     * Returns a reference to the element at the back of this queue.
     * The element is not removed from the queue.
     * @return the first element in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T last() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");

        return queue[back - 1];
    }//end last
    
    /**
     * Returns true if this queue is empty and false otherwise.
     * @return true if this queue is empty
     */
    public boolean isEmpty()
    {
	return (count == 0);
    }//end isEmpty
    
    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in the queue
     */
    public int size()
    {
	return count;
    }//end size
    
    /**
     * Returns a string representation of this queue.
     * @return a string representation of the queue
     */
//    @Override
    public String toString()
    {
        String output = "[Front]";
        
        int i = 0;
        int scan = front;
        if(isEmpty())
        {
            return "The queue is empty";
        }//end if
        else
        {
            while(i<count)
            {
                output += "[" + queue[scan] + "]";
                scan = (scan + 1) % queue.length;
                i++;
            }//end while
        }//end else
        
        output += "[Back]";
        return output;
    }//end toString

}//end CircularArrayQueue Class

/*
Assistance from CircularArrayQueue source code
Assistance from Chapter 14 Queues
Assistance from https://stackoverflow.com/questions/34424358/java-adding-to-the-front-of-queue-deque
*/