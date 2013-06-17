/**
 * 
 * @author Bhavyanshu Parasher - bhavyanshu.spl@gmail.com
 * 
 *         Basically conditions are statements which determine the control flow.
 *         For example - If it rains i will not go out else i will go to KFC. In
 *         programming terms we can write it is if(!rains) {
 *         System.out.println("Go Out"); } else {
 *         System.out.println("Don't go out. It's acid rain"); So here we are
 *         checking the value of "rains" variable. boolean rains = true; Now in
 *         this case it means it is raining so the person will not go out. Now
 *         you can get on with the code. Just follow. You will understand
 *         everything for sure.
 */
public class Conditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ada = 4; // Refer to VarTypre.java to understand variable
						// declarations
						// and types.
		if (ada == 4) { // Here we first check if value of ada is equal to 4 or
						// not.
						// Since we have declared above that it is 4 so it will
						// enter the loop.
			System.out.println("Yup ada is 4");
		} else {
			System.out.println("Nope it is not 4"); // If the value of ada was
													// not 4 then the control
													// will shift to this
													// statement.
		}

		/*
		 * Let us take a look at another example.
		 */
		String a = new String("Wow");
		String b = "Wow";
		String c = a;
		

		boolean b1 = a == b; // False, since a and be are not the same object
		boolean b2 = b.equals(b + "!"); // False, not same values
		boolean b3 = !c.equals(a); // False, c equals a as assigned. so !c
									// cannot be equal to a -_-

		if (b1 && b2 && b3) {
			System.out.println("Success!" + a + b + c);
		} else {
			System.out.println("b1 is " + b1 + ", b2 is " + b2 + ", b3 is "
					+ b3);
		}
	}
}
