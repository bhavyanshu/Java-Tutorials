/**
 * @author Bhavyanshu Parasher - bhavyanshu.spl@gmail.com
 * 
 *         Hello all, this is the first tutorial for Java. Simply go on reading
 *         through the code. I have added line by line comments to each code to
 *         explain it in a simpler manner. If you have any query then simple
 *         contact me bhavyanshu.spl@gmail.com
 */

public class HelloWorld { // We have defined a class HelloWorld which has
							// "Public" access which in simple term means that
							// it is accessible from anywhere.

	/*
	 * @param args
	 * 
	 * Okay now let us look at this line -> public static void main(){} public
	 * means that anyone can access it. It's like an access mode. Others are
	 * private, protected which we will discuss later. static means that you can
	 * run this method without creating an instance of Main. void means that
	 * this method doesn't return any value. Or else we must use the `return
	 * "something";` if in case it is supposed to return anything. main is the
	 * name of the method.
	 * 
	 * Now let us look at the statement inside the eclosed brackers -> `String[]
	 * args` We need to pass some arguements to a method we define. In this case
	 * it's an array of strings. "String args[]" and "String[] args" are for all
	 * purposes the same thing. The only difference is style, where
	 * "String args[]" can mean a "string array called args which is an array"
	 * or the one I personally prefer "String[] args" which basically says it’s
	 * a "string array called args". Either way it describes the same thing.
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		/*
		 * System is a pre-defined class that Java provides us and it holds some
		 * useful methods and variables. You should refer to java docs to know
		 * more. out is a static variable in within System class that basically
		 * holds the output.
		 * 
		 * Now remember two things here. if you use System.out.println(), the
		 * cursor skips the line and moves to next line after displaying
		 * required result. if you use System.out.print(), the cursor remain on
		 * the same line after displaying the result.
		 */
	}
}

/**
 * Expected Output : Hello World
 */
