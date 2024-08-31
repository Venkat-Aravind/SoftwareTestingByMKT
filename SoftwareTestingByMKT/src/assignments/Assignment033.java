//Assignment 33 WAP to reverse a String using for loop
package assignments;

import java.util.Scanner;

public class Assignment033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse: ");
		String input = sc.next();
		String output = "";
		for(int i=input.length()-1;i>=0;i--) {
			char c1 = input.charAt(i);
			output=output+c1;
		}
		System.out.println("Reversed String is: "+output);
		sc.close();
	}

}
