/**
 * Bhavyanshu Parasher
 * This program is used to find a factorial using scanner class
 */
import java.util.Scanner;
import java.io.*;

class ScannerFact{
	public static void main(String args[]){
		System.out.print("Enter the number whose factorial you want to find: ");
		Scanner s = new Scanner(new InputStreamReader(System.in));
		int n = s.nextInt();
		for (int i=n-1;i>0;i--){
			n=n*i;
		}
	System.out.println("The factorial is: " + n);			
	}
}