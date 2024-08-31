//Assignment 28: WAP on super keyword (method overriding)
package assignments;
class Parent {
	void login() {
		System.out.println("Login using email id");
	}
}
public class Assignment028 extends Parent {
	void login() {
		System.out.println("Login using mobile no");
		super.login();//Calling login method from super class
	}
	public static void main(String[] args) {
		Assignment028 m1 = new Assignment028();
		m1.login(); 
	}
}