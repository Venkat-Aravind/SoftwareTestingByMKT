//Assignment 29: WAP on this()
package assignments;
public class Assignment029 {
	Assignment029()
	{
		this(9);
		System.out.println("with no para");
	}
	Assignment029(int a)
	{	
		System.out.println("with a as int");
	}
	Assignment029(double a)
	{
	System.out.println("with a as double");
	}
	public static void main(String[] args) {
		new Assignment029();
	}
}