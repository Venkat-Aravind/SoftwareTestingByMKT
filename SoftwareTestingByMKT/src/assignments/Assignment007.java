//Assignment 7: WAP on global variable
package assignments;
public class Assignment007 {
	int a = 10;// a is Global Variable and it's scope is this whole class
	Assignment007() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Assignment007();
	}
}
