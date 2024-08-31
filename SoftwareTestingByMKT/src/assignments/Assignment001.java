//"Assignment 1: WAP on calling static methods in main method"
package assignments;
public class Assignment001 {
	static void staticmethod()
	{
		System.out.println("Static Method-Non Parameterized");
	}
	static void staticmethod_parameterized(int a)
	{
		System.out.println("Static Method-Parameterized");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod();//Calling Static method in main method-non parameterized
		staticmethod_parameterized(10);//Calling Static method in main method-parameterized
	}
}
