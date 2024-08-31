//Assignment 20: Accept input from user and calculate Area of Rectangle formula (l*b)
package assignments;
import java.util.Scanner;
public class Assignment020 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the width of the Rectangle: ");
		int w = s1.nextInt();
		System.out.println("Enter the length of the Rectangle: ");
		int l = s1.nextInt();
		int area = l*w;
		System.out.println("Area of Rectangle is: "+area);
		s1.close();
	}
}
