//Assignment 25: Write a program on single level inheritance
package assignments;
class Amazon
{
	static void loginwithmobileno()
	{
		System.out.println("Mobile no");
	}
	 void registartion()
	{
		System.out.println("registartion no");
	}
}
public class Assignment025 extends Amazon {//Calling SuperClass(Amazon) from SubClass(Assignment025)

	public static void main(String[] args) {
		loginwithmobileno();//calling static superclass method in subclass
		Assignment025 d1=new Assignment025();
		d1.registartion();//calling non-static superclass method in subclass
	}
}
