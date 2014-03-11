/**
 * @author Bhavyanshu Parasher
 *
 */

public class SuperExample {
	SuperExample(){ // Contructor of Base Class
		System.out.println("Constructor of Base Class called - SuperExample"); 
		} 
}

class b extends SuperExample {
	public static void main(String[] args) {
        System.out.println("Called from derived class");
        b ob = new b();
    }
}
