//Assignment 18: Accept number from user and Write a program to check Number is even or odd 
//by using if else statement 
package assignments;

import java.util.Scanner;

public class Assignment018 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a = s1.nextInt();
		if(a%2==0) {
			System.out.println("Entered number is Even");
		} else {
			System.out.println("Entered number is Odd");
		}
	}
}
