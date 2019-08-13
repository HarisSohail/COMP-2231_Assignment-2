/**
 * CircularArrayQueueDriver.java
 *
 * 
 * COMP 2231 Assignment 2 Question 1
 */
package assignment_2c;

import jsjf.exceptions.EmptyCollectionException;

public class Driver 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {			
        
        CircularArrayQueue<Integer> dequeTest = new CircularArrayQueue<>();
        
        System.out.println("===================================");
	System.out.println("             EMPTY QUEUE           ");
        System.out.println("===================================");
        System.out.println("size of queue is " + dequeTest.size());
        System.out.println("is the queue empty: " + dequeTest.isEmpty());
        System.out.println("Queue:");
	System.out.println(dequeTest);
        
        System.out.println("--------Dequeue empty queue--------");
        try 
        {
            dequeTest.dequeue();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();

        System.out.println("-----Dequeue rear empty queue------");
        try 
        {
            dequeTest.dequeueBack();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
        
	System.out.println("---------First empty queue---------");
        try 
        {
            dequeTest.first();
	}//end try
        catch(EmptyCollectionException e) 
        {
            System.out.println("Exception: " + e.getMessage());
	}//end catch
	System.out.println();
	
        System.out.println("===================================");
        System.out.println("               QUEUE               ");
	System.out.println("===================================");
        System.out.println("-----------Making Queue------------");
        dequeTest.enqueueFront(1);
	System.out.println("Add 1 to front of queue");
        System.out.println(dequeTest);
	System.out.println();
        
        dequeTest.enqueueFront(2);
	System.out.println("Add 2 to front of queue");
        System.out.println(dequeTest);
	System.out.println();
		
	dequeTest.enqueueFront(3);
	System.out.println("Add 3 to front of queue");
        System.out.println(dequeTest);
	System.out.println();
		
	dequeTest.enqueueFront(4);
	System.out.println("Add 4 to front of queue");
        System.out.println(dequeTest);
	System.out.println();
        
        dequeTest.enqueueFront(5);
	System.out.println("Add 5 to front of queue");
        System.out.println(dequeTest);
	System.out.println();
        
        dequeTest.enqueue(0);
	System.out.println("Add 0 to back of queue");
        System.out.println(dequeTest);
	System.out.println();

        dequeTest.enqueue(-1);
	System.out.println("Add -1 to queue");
        System.out.println(dequeTest);
	System.out.println();
        
        System.out.println("---------Checking queue----------");
	System.out.println("size of queue is " + dequeTest.size());
        System.out.println("is the queue empty: " + dequeTest.isEmpty());
	System.out.println();
        
        System.out.println("first should be 5");
	System.out.println("First: " + dequeTest.first());
        System.out.println("Last: " + dequeTest.last());
	System.out.println();
        
        System.out.println("Dequeue from queue");
	System.out.println("Dequeued: " + dequeTest.dequeue());
	System.out.println("Queue:");
	System.out.println(dequeTest);
	System.out.println();        
        
        System.out.println("Dequeue from back of queue");
	System.out.println("Dequeued: " + dequeTest.dequeueBack());
	System.out.println("Queue:");
	System.out.println(dequeTest);
	System.out.println();        
    }//end main

}//end Driver
