/**
 * @author Bhavyanshu Parasher
 * A very simple example of inheritance.
 */

public class InheritanceExample {
	
	private int value = 3;
	private int value2 = 5;
	
	public void display() {
		System.out.println("Display function in Base Class"); 
		System.out.println("The value is " + value + value2); //Output will be 35
	}
}

class DerivedFromBase extends InheritanceExample {
	
	public static void main(String[] args) {
		InheritanceExample inheritme = new InheritanceExample();
		inheritme.display();
		// System.out.println(inheritme.value); This will not work because we have set both int values as private.
	}
	
}