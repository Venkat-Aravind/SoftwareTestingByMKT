package day26_05aug2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age:");
		try {
		int age = s1.nextInt();
		} catch(InputMismatchException a) 
		{
			System.out.println("Sorry, enter your age:");
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = s2.nextInt();
		}
		System.out.println("Enter your FirstName:");
		Scanner s3 = new Scanner(System.in);
		String firstname = s3.next();
		}

}
