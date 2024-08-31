package day22_30jul2024;
abstract class Grand_Parent                            //abstract class
{
	abstract void add();
	abstract void subtarction();
	static void multi()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
}
class Parent        extends      Grand_Parent                    //concrete class
{
	static void div()
	{
		int a=10;
		int b=20;
		System.out.println(b/a);
	}


	void add() {
		
	}
	void subtarction() {
		
	}
}
public class AbstractClass    extends Parent                //concrete class
{
public static void main(String[] args) 
{

	
	
	
}
}