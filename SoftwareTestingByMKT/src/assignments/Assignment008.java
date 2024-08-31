//Assignment 8: WAP on Final variable
package assignments;
public class Assignment008 {
	final double pi=3.14;// here value of pi=3.14 cannot be modified inside this class
	Assignment008() {
		final int r = 10;//here value of r=10 cannot be modified inside this method 
		double area;
		area = pi*r*r;
		System.out.println("Area of circle is: "+area);
	}
	public static void main(String[] args) {
	new Assignment008();	
	}
}
