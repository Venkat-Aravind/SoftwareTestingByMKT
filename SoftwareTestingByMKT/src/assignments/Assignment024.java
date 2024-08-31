//Assignment 24: Accept input from user and calculate area of trapezium(formula -> 1/2*(a+b)*h
package assignments;
import java.util.Scanner;
public class Assignment024 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the side a of the Trapezium: ");
		int a = s1.nextInt();
		System.out.println("Enter the side b of the Trapezium: ");
		int b = s1.nextInt();
		System.out.println("Enter the height of the Trapezium: ");
		int h = s1.nextInt();
		int circumference = ((a+b)*h)/2;
		System.out.println("Area of the Trapezium is: "+circumference);
		s1.close();
	}
}