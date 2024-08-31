//Assignment 23: Accept input from user and calculate Circumference of Rectangle formula 2*(a+b)
package assignments;
import java.util.Scanner;
public class Assignment023 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the width of the Rectangle: ");
		int w = s1.nextInt();
		System.out.println("Enter the length of the Rectangle: ");
		int l = s1.nextInt();
		int circumference = 2*(l+w);
		System.out.println("Circumference of Rectangle is: "+circumference);
		s1.close();
	}
}