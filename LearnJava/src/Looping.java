/**
 * 
 * @author Bhavyanshu Parasher - bhavyanshu.spl@gmail.com Let's learn about
 *         loops. There are basically two loops - For & While. They are used for
 *         many purposes. Like for example, you wish to loop through an array
 *         and print the output from some operation on the array. Loops are
 *         widely used in programming. In a for loop, there are 3 important
 *         things to be taken care of. Initialization statement, The condition,
 *         An increment/Decrement on some variable. 
 *         Ex - for (int i = 0; i < 3; i++) {} 
 *         First section runs once when we enter the loop. Second
 *         section is the gate keeper, if it returns true, we run the statements
 *         in the loop, if it returns false, we exit the loop. It runs right
 *         after the first section for the first time, then every time the loop
 *         is finished and the third section is run. The third section is the
 *         final statement that will run every time the loop runs. 
 *         int i = 0; i < 3 // 0 < 3 = true // Inside of loop 
 *         i++ // i is now 1 i < 3 // 1 < 3 = true // Inside of loop 
 *         i++ // i is now 2 i < 3 // 2 < 3 = true // Inside of loop 
 *         i++ // i is now 3 i < 3 // 3 < 3 = false // Loop is done...
 *         Now let us get on with some coding.
 */
public class Looping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
		    int el = arr[i];
		    System.out.println(el);
		}
		
		int i;
		for (i = 0; i < 5; i++) {
		    if (i >= 2) {
		        break;
		    }
		    System.out.println("Cats,");
		}
		System.out.println("cats are everywhere!");
	}

}
