/**
 * Palindrome.java
 *
 * 
 * COMP 2231 Assignment 2 Question 4
 * 
 * Uses a stack and a queue to determine if a given string is a palindrome
 */
package assignment_2d;

public class Palindrome
{
    public static boolean isPalindrome(String input)
    {		
	input = input.toUpperCase().trim();//accounting for upper/lowercase interfearences and spaces
		
        LinkedStack<String> stack = new LinkedStack<>();
	LinkedQueue<String> queue = new LinkedQueue<>();
	
        String s = new String();
	for(int i=0; i<input.length(); i++) 
        {//adding characters to stack and queue
	    s = "" + input.charAt(i);
	    queue.enqueue(s);
	    stack.push(s);
	}//end for
		
	boolean palindrome = true;
		
        while(!stack.isEmpty() && !queue.isEmpty())
        {//stack and queue are not empty
            if(queue.dequeue().compareTo(stack.pop()) == 0)
            {//if elem from queue matches elem from stack(using compareTo)
             //queue(FIFO)//stack(LIFO)
                palindrome = true;
            }//end if
            else
            {//if they do not match
                palindrome = false;
            }//end else
	}//end while
        
        return palindrome;
    }//end isPalindrome
    
}//end Palindrome Class

/*
Assistance from: 
    www.stackoverflow.com/questions/22650069/determine-palindrome-by-comparing-stack-and-queue
Assistance from: 
    www.daniweb.com/programming/software-development/threads/235537/palindrome-program-using-stack-queue
*/