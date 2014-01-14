/**
 * @author Bhavyanshu Parasher
 * Testing the string input using next() & nextLine() function
 */

import java.util.Scanner;

public class StringScan {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name=sc.nextLine(); //reads input including space between the words
		System.out.println("Your name is : "+name);	
		System.out.print("Enter your roll no: ");
		String roll = sc.next(); //Does not recognize white spaces. Never to be used for inputs with spaces.
		System.out.println("You roll number is: "+roll);
	}
}
