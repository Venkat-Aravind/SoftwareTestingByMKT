//Assignment 44: WAP on interface(try to write logic inside methods) 
package assignments;
interface A{
	void add();
	void sub();
}
interface B{
	void mul();
	void div();
}
public class Assignment044  implements A,B{
	@Override
	public void mul() {
		int a =50;
		int b =40;
		System.out.println(a*b);	
	}
	@Override
	public void div() {
		int a =50;
		int b =40;
		System.out.println(a/b);	
	}
	@Override
	public void add() {
		int a =50;
		int b =40;
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		int a =50;
		int b =30;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Assignment044 m1= new Assignment044();
		m1.add();
		m1.sub();
		m1.div();
		m1.mul();
	}	
}