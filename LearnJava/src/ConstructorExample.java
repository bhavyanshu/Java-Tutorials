/**
 * @author Bhavyanshu Parasher
 *
 */

public class ConstructorExample {
	private String FIRST_NAME;
	private String ROLL_NUM;
	
	ConstructorExample(String firstname, String rollnum){ // Constructor name same as the class itself.
		FIRST_NAME = firstname;
		ROLL_NUM = rollnum;
	}
	
	public String display(){
		return("First Name: "+ FIRST_NAME +" | Roll no: " + ROLL_NUM);
		
	}
	
	public static void main(String[] args){
		ConstructorExample constructs = new ConstructorExample("Bhavyanshu","10CSU044");
		System.out.println(" "+constructs.display());
	}
}
