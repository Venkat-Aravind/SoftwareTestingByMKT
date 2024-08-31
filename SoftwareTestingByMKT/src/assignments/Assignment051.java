//Assignment 51: both Parent and child class has 2 nonstatic and 2 static methods. do up casting and down casting
package assignments;
class ParentType2{
	static void add() {
		System.out.println("add");
	}	
	static void sub() {
		System.out.println("sub");
	}
	public void mul() {
		System.out.println("mul");
	}
	public void div() {
		System.out.println("div");
	}	
}
public class Assignment051 extends ParentType2 {
	static void login() {
		System.out.println("login");
	}	
	static void register() {
		System.out.println("register");
	}
	public void logout() {
		System.out.println("logout");
	}	
	public void cart() {
		System.out.println("cart");
	}	
	public static void main(String[] args) {		
		System.out.println("Implicit Upcasting inheriting parent class properties");		
		 ParentType2 p1  = new Assignment051();    //implicit upcasting
		 p1.div();           //parentclass properties
		 p1.mul();
		 add();
		 sub();		 
		 System.out.println("Explicit Downcasting inheriting parent and child class properties");
		 Assignment051 c1=(Assignment051)p1;
		 c1.cart();
		 c1.div();
		 c1.logout();
		 c1.mul();
		 add();
		 sub();
		 register();
		 login();	   
	}
}