//Assignment 17: Accept number from user and calculate Area of circle (formula πr square, PI=3.14f) 
package assignments;
import java.util.Scanner;
public class Assignment017 {
	static float pi = 3.14f;
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the radius:");
		int radius = s1.nextInt();
		double area = pi*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
}
