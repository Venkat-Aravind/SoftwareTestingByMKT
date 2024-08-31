//Assignment 27: WAP on super()
package assignments;
class value {
	int a = 10;
}
public class Assignment027 extends value {
	void value() {
		System.out.println("value of a is: "+super.a);
	}
	public static void main(String[] args) {
		Assignment027 m1 = new Assignment027();
		m1.value(); 
	}
}