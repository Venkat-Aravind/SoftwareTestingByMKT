//Assignment 34: WAP to find if the given String is palindrome
package assignments;
import java.util.Scanner;
public class Assignment034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		String input = sc.next();
		String output = "";
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			output = ch+output;
			sc.close();
		}
		System.out.println("Reversed String is: "+output);
		if(input.equals(output)) {
			System.out.println("Entered String is a Palindrome");
		} else {
			System.out.println("Entered String is not a Palindrome");
		}
	}
}
