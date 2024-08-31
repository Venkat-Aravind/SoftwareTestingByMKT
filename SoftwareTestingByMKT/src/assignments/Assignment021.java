//Assignment 21: Accept input from user and calculate Circumference of circle formula  2*pi*r
package assignments;
import java.util.Scanner;
public class Assignment021 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: ");
		double r = s1.nextInt();
		double circumference = 2*Math.PI*r;
		System.out.println("Circumference of Triangle is: "+circumference);
		s1.close();
	}
}