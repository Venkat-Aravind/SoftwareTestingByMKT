//Assignment 43: WAP on abstraction(try to write logic inside method)
package assignments;
abstract class Amazon1{       //abstract class : abstract should be written before it
	 abstract void login();
	 abstract void register();     //abstract methods
    }
public class Assignment043 extends Amazon1 {            //concrete class
	static void logout()         //concrete method
	{
		System.out.println("logout");
	}
	static void  run()
	{
		System.out.println("run");
	}
@Override
void login()
{
	 int a=10;
	 int b=20;
	int c=a+b;
			System.out.println(c);
}
@Override
void register() 
{
	System.out.println("register");
}
public static void main(String []args) {
	Assignment043 l1= new Assignment043();
   l1.login();
   l1.register();
   logout();
}
}