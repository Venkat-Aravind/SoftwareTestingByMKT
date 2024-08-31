//Assignment 5: WAP on contructor overloading
package assignments;
public class Assignment005 {
	Assignment005(){
		System.out.println("Constructor with no parameters");
	}
	Assignment005(int a) {
		System.out.println("Constructor with one parameter");
	}
	Assignment005(int a,int b) {
		System.out.println("Constructor with two parameters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment005();//Calling 
		new Assignment005(1);
		new Assignment005(1,2);
	}
}