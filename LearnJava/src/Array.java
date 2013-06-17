/**
 * 
 * @author Bhavyanshu Parasher - bhavyanshu.spl@gmail.com
 * 
 *         Ok in this tut we are going to learn everything about arrays.
 *         Declarations, operations etc. Arrays in Java are also objects. They
 *         need to be declared and then created. In order to declare a variable
 *         that will hold an array of integers, we use the following syntax:
 * 
 *         int[] arr; -> this is the declaration part. Remember, we still
 *         haven't created it yet. Because we have not mentioned size to an
 *         array. Another way -> int[] arr = {1, 2, 3, 4, 5};
 * 
 *         arr = new int[10];
 * 
 *         This will create a new array with the size of 10. Now let's get on
 *         with some coding.
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[7]; //An array of size 7
		for (int count = 0; count < 7; count++) { //Looping through the array
			array[count] = count + 1;
		}
		for (int count = 0; count < 7; count++) { //Looping to print values of array
			System.out.println("array[" + count + "] = " + array[count]);
		}
		/*
		 * Amazing exercise i found: Solve the error in below code: int[]
		 * numbers = {1, 2, 3}; int length = numbers[3];
		 * System.out.println(numbers.length); char[] chars = new char[length];
		 * chars[numbers.length + 4] = 'y'; System.out.println("Done!");
		 */
	}
}
