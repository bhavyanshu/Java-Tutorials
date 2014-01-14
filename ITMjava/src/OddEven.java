/**
 * @author Bhavyanshu Parasher
 * Checking odd even. Uses method & return, while loop, char data type to ask user again and again for input. 
 */
import java.util.*;
import java.io.*;

public class OddEven {
	
	public static String testnumber(int num){ // Method to check whether the number is even or odd
		if(num%2==0){
			return "Even";
		}
		else
			return "Odd";
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char c='Y'; 
		while(c=='Y'){
		System.out.print("Enter the number for which you want to test odd/even: ");
		int n = sc.nextInt();
		System.out.println("The number is " + testnumber(n));
		System.out.print("Would you like to continue? Enter Y/N :");
		c = sc.next().charAt(0);
		}
	}

}
