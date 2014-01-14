/**
 * Bhavyanshu Parasher
 * This program finds factorial based on CL arguments passed to the program
 */

class CmdFact {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		for (int i=n-1;i>0;i--){
			n=n*i;
		}
	System.out.println("The factorial is: " + n);	
	}
}