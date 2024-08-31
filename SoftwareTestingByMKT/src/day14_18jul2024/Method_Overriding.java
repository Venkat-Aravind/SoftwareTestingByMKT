package day14_18jul2024;
class Parent {
	void login() {
		System.out.println("Login using email id");
	}
}
public class Method_Overriding extends Parent {
	void login() {
		System.out.println("Login using mobile no");
		super.login();//Calling login method from super class
	}
	public static void main(String[] args) {
		Method_Overriding m1 = new Method_Overriding();
		m1.login(); 
	}
}
