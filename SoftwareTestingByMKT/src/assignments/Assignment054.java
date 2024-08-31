//"Assignment 54: WAP to showcase the Compile Time Polymorphism"
package assignments;
public class Assignment054 {
	public static void main(String[] args) {
		Assignment054 a = new Assignment054();
		a.Login(5);
		a.Login("Venkata");
	}	
	void Login(String name) {
		System.out.println("using name login can be perform");
	}	
	void Login(int tokennumber) {
		System.out.println("using token login can be perform");
	}
}
