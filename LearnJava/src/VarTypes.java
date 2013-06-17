/**
 * 
 * @author Bhavyanshu Parasher - bhavyanshu.spl@gmail.com
 * 
 *         So in this tutorial we are going to learn about variables and types
 *         in Java. Not everything is an object here ;)
 * 
 */

public class VarTypes {
	public static void main(String[] args) { // refer to HelloWorld.java for
												// more info on this statement.
		byte zero = 0; // zero is the byte type variable.
		String output = "Waa" + zero + "w. It feels good :3"; // output is of the type String. 
															  //I have shown concatenation as well.
		System.out.println(output); // output the value contained in "output"
									// variable.
		/*
		 * Let us move on to other variables now.
		 */
		int value1 = 4; // Declared integer type variable named value1
		System.out.println(value1); // output the value contained in value1
		double value2 = 5.123456789123456789; // Declared double type variable
												// value2. Here we are checking
												// how big the double variable
												// can be.
		System.out.println(value2); // Output the value contained in "value2"
									// variable
		float value3 = 6.2454389109993484858020f; // look closely at the ending
													// character "f". Read below
													// for more info.
		System.out.println(value3);
		/*
		 * Declared float type variable value3. Now here is a trick we need. We
		 * must implement type casting in order to achieve float type variable
		 * otherwise java will give an error. It will give error because it
		 * assumes you are assigning a double. It usually gives
		 * "Type mismatch: cannot convert from double to float" error in such
		 * cases.
		 */
		char c = 'B'; // Declaring a variable of character type.
		System.out.println(c);
		/*
		 * String is not a primitive. It's a real type, but Java has special
		 * treatment for String. Let me show you few ways you can use to build
		 * up strings.
		 */
		// Create a string with a constructor
		String s1 = new String("Did you check out the grumpy cat meme?");
		// Just using "" creates a string, so no need to write it the previous
		// way.
		String s2 = " No. ";
		// Java defined the operator + on strings. No operator overloading in
		// java. + is always for strings.
		String s3 = s1 + s2; // concat with +
		System.out.println(s3);
		/*
		 * Others. Well major one in others is boolean type. You will be using
		 * it a lot while checking for conditions and flags.
		 */
		boolean b = false; // b is of type boolean here whose initial value is
							// set to false.
		b = true; // Here the value of b changes to true.

		boolean toBe = false; // Another boolean type "toBe" whose value is set
								// to false.
		b = toBe || !toBe; // To be or not to be! "||" => "or", "&&" => "and".
							// Here basically b value is set if toBe is false or
							// true.
		System.out.println(b);
		if (b) { // If value of b = true then it will enter this if loop.
			System.out.println(toBe); // and print the value contained in toBe.
		}
	}
}