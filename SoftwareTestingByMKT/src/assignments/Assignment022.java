//Assignment 22: Accept input from user and calculate Circumference of Triangle formula a+b+c
package assignments;
import java.util.Scanner;
public class Assignment022 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the side a of the Triangle: ");
		int a = s1.nextInt();
		System.out.println("Enter the side b of the Triangle: ");
		int b = s1.nextInt();
		System.out.println("Enter the side c of the Triangle: ");
		int c = s1.nextInt();
		int circumference = a+b+c;
		System.out.println("Circumference of Triangle is: "+circumference);
		s1.close();
	}
}