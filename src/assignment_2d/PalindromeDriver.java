/**
 * PalindromeDriver.java
 *
 * 
 * COMP 2231 Assignment 2 Question 4
 * 
 * Driver testing different palindromes and 
 * allowing user to test there own.
 */
package assignment_2d;

import java.util.Scanner;

public class PalindromeDriver 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                          TESTS                                        ");
	System.out.println("---------------------------------------------------------------------------------------");
        //Empty string (treating as true bc a single character can be considered palindrome)
	System.out.println("Empty String: " + Palindrome.isPalindrome(""));
		
	//simple palindromes(only uppercase)
	System.out.println("BOB: " + Palindrome.isPalindrome("BOB"));
        System.out.println("HANNAH: " + Palindrome.isPalindrome("HANNAH"));
        System.out.println("ANNA: " + Palindrome.isPalindrome("ANNA"));
		
        //mixed palindrome(upper and lowercase) 
	System.out.println("Bob: " + Palindrome.isPalindrome("Bob"));
        System.out.println("Hannah: " + Palindrome.isPalindrome("Hannah"));
        
	//not palindrome
	System.out.println("Hanna: " + Palindrome.isPalindrome("Hanna"));
        System.out.println("Danny: " + Palindrome.isPalindrome("Danny"));
        System.out.println("Apple pie: " + Palindrome.isPalindrome("Apple pie"));
        
	//palindrome no spaces/with spaced
	System.out.println("qwertyytrewq: " + Palindrome.isPalindrome("qwertyytrewq"));
	System.out.println("qwerty ytrewq: " + Palindrome.isPalindrome("qwerty ytrewq"));
        System.out.println("q we rty ytr ewq: " + Palindrome.isPalindrome("q we rty ytr ewq"));
		
        //palindrome as a sentence
	System.out.println("Rats live on no evil star: " + Palindrome.isPalindrome("Rats live on no evil star"));
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();       
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                      USER TESTS                                       ");
	System.out.println("---------------------------------------------------------------------------------------");
        //user inputted words 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word to check if it is a palindrome<enter>:");
        String input = scan.nextLine();
        if(Palindrome.isPalindrome(input)) 
        {
            System.out.printf("'%s' is a palindrome.\n", input);
        }//end if 
        else 
        {
            System.out.printf("'%s' is not a palindrome.\n", input);
        }//end else
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();       
    }//end main
    
}//end PalindromeDriver
