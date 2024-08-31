//"Assignment 55: WAP to showcase the Run Time Polymorphism"
package assignments;
class Parent1 {
	void pDisplay() {
		System.out.println("parent display method");
	}
	void pCount() {
		System.out.println("PCount display method");
	}
}
public class Assignment055 {
	public static void main(String[] args) {
		// object behaviour is different in different stages of lifecycle in rumtime
				// based on object creation know as runtimepoly
		Assignment055 p1 = new Assignment055();
				p1.cCount();
				p1.cDisplay(); // by creating child class object child methods will access
				
				Parent1 p = new Parent1();
				p.pCount();
				p.pCount(); // by creating parent class object will access parent class methods
			}
			void cDisplay() {
				System.out.println("cDisplay child method");
			}
			void cCount() {
				System.out.println("cCount child method");
	}
}
