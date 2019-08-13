/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2d;

import jsjf.LinearNode;
import jsjf.QueueADT;
import jsjf.exceptions.EmptyCollectionException;
/**
 *
 * @author Haris
 */
public class LinkedQueue<T> implements QueueADT<T> 
{
/**
	 * The front node of the queue
	 */
	private LinearNode<T> front;

	/**
	 * The back node of the queue
	 */
	private LinearNode<T> back;

	/**
	 * Internal counter of number of elements in the queue
	 */
	private int counter;

	/**
	 * Public constructor, linked list internally so no size restrictions
	 */
	public LinkedQueue() {
		counter = 0;
		front = null;
		back = null;
	}

	/**
	 * Adds an element to the back of the queue
	 */
	public void enqueue(T element) {

		LinearNode<T> node = new LinearNode<T>(element);

		
		if (isEmpty()) {
			// if queue is currently empty, set front to this node
			front = node;
		} else {
			// otherwise add the element to the back of the queue
			back.setNext(node);
		}
		
		// update the back pointer to the new node
		back = node;

		// increment the counter
		counter++;
	}

	/**
	 * Removes and returns the element at the front of the queue
	 * 
	 * @throws EmptyCollectionException
	 *             if the queue is empty
	 */
	public T dequeue() throws EmptyCollectionException {

		// if the queue is empty, throw
		if (isEmpty()) {
			throw new EmptyCollectionException("queue");
		}

		// store the current front node
		LinearNode<T> node = front;

		// set front to next node in list
		front = front.getNext();

		// decrement the counter
		counter--;

		// if queue is now empty set back to null too
		if (isEmpty()) {
			back = null;
		}

		// return the element from the original front node
		return node.getElement();
	}

	/**
	 * Returns a reference to the element at the front of the queue without
	 * removing it from the queue
	 * 
	 * @throws EmptyCollectionException
	 *             when the queue is empty
	 */
	public T first() throws EmptyCollectionException {

		if (isEmpty()) {
			throw new EmptyCollectionException("queue");
		}

		// return the element from the front node
		return front.getElement();
	}

	/**
	 * Determines if the queue is currently empty
	 * 
	 * @return boolean true if the queue is empty, false if not
	 */
	public boolean isEmpty() {

		// if size is 0 queue is empty
		return (size() == 0);
	}

	/**
	 * Determine how many elements are currently in the queue
	 * 
	 * @return int indicating how many elements are currently in the queue
	 */
	public int size() {
		// return the counter variable
		return counter;
	}
}    

