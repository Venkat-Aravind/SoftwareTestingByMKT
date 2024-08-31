//"Assignment 2 WAP on calling non-static methods in main method"
package assignments;
public class Assignment002 {
	void nonstatic() {
		System.out.println("Non Static-Non Parameterized");
	}
	void nonstatic_parameterized(int a) {
		System.out.println("Non Static-Parameterized");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment002 a2 = new Assignment002();
		a2.nonstatic();
		a2.nonstatic_parameterized(10);
	}
}
