//Assignment 19: Accept input from user and calculate Area of Triangle(formula - (b*h)/2)
package assignments;
import java.util.Scanner;
public class Assignment019 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the base of the Triangle: ");
		int b = s1.nextInt();
		System.out.println("Enter the height of the Triangle: ");
		int h = s1.nextInt();
		int area = (b*h)/2;
		System.out.println("Area of Triangle is: "+area);
		s1.close();
	}
}
