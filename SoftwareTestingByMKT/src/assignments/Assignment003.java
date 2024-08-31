//"Assignment 3: WAP on constructor"
package assignments;
public class Assignment003 {
	Assignment003(){
		System.out.println("This is Constructor: Non-Parameterized");
	}
	Assignment003(int a){
		System.out.println("This is Constructor: Parameterized");
	}
	public static void main(String[] args) {
		new Assignment003();//Calling non-parameterized constructor
		new Assignment003(10);//Calling parameterized constructor
	}
}
