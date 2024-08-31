package day06_08jul2024;
public class How_to_call_NonStaticMethod 
{
	 void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	 void sub()
	 {
		int a=10;
		int b=20;
		int subtraction=a-b;
		System.out.println(subtraction);
	 }
	 void mul()
	 {
		int a=10;
		int b=20;
		int multi=a*b;
		System.out.println(multi);
	 }
	public static void main(String[] args) 
	{
		//by creating an object with the help of its referance 
		//varaible we can call any non static methods
		//syntax: classname varaible=new classname();
		
		How_to_call_NonStaticMethod n1=new How_to_call_NonStaticMethod();
		n1.add();
		n1.sub();
		n1.mul();
	}
	

}
