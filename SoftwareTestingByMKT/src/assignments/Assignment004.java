//Assignment 4 WAP on method overloading
//Creating multipe methods with same name but variations in argument list is called Method Overloading
package assignments;
public class Assignment004 {
	static void method_overloading() {
		System.out.println("Method with no parameters");
	}
	static void method_overloading(int a) {
		System.out.println("Same Method with one paramater ");
	}
	static void method_overloading(int a, char b) {
		System.out.println("Same Method with two parameters");
	}
	public static void main(String[] args) {
		method_overloading();
		method_overloading(1);
		method_overloading(1,'a');
	}
}