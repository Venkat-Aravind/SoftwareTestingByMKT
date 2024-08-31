//Assignment 16: Accept two numbers from user and perform all the Arithmetic operations(+, *, /, %) 
package assignments;
import java.util.Scanner;
public class Assignment016 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of a:");
		int a = s1.nextInt();
		System.out.println("Please enter the value of b:");
		int b = s1.nextInt();
		int sum = a+b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum of a&b = "+sum);
		System.out.println("Mul of a&b = "+mul);
		System.out.println("Div of a&b = "+div);
		System.out.println("Mod of a&b = "+mod);
	}
}
