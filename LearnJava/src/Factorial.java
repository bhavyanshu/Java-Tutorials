/* Bhavyanshu Parasher
 * This program is used to find the factorial using BufferedReader
 */
import java.io.*;

class Factorial {
	public static void main(String args[]) throws NumberFormatException, IOException{
		System.out.print("Enter the number whose factorial you want to find: ");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for (int i=n-1;i>0;i--){
			n=n*i;
		}
	System.out.println("The factorial is: " + n);	
	}
}