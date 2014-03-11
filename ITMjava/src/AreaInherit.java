import java.util.Scanner;

/**
 * @author Bhavyanshu Parasher
 * A very simple example of inheritance.
 */

public class AreaInherit {
	
	private int n;
	
	public void getlength() {
	 System.out.print("Enter the length of the squre: ");
	 Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	 display(n);
	}
	
	public void display(int num) {
		System.out.println("********** AREA of Square *********");
		int ar;
		ar=num*num;
		System.out.println("The area of the square is: " + ar);
	}
}

class InputLength extends AreaInherit {
	
	public static void main(String[] args) {
		AreaInherit area = new AreaInherit();
		area.getlength();
		// System.out.println(inheritme.value); This will not work because we have set both int values as private.
	}
	
}