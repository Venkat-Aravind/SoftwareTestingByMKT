package day11_15jul2024;

import java.util.Scanner;
//System.in -> to take input at run time
//System.out-> to give the value in output
public class Scanner_Class {
	public static void main(String[] args) {
		//Lets do addition of 2 numbers at run time
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of a:");
		int a = s1.nextInt();
		System.out.println("Please enter the value of b:");
		int b = s1.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum of a&b = "+sum);
		System.out.println("Sub of a&b = "+sub);
		System.out.println("Mul of a&b = "+mul);
		System.out.println("Div of a&b = "+div);
		System.out.println("Mod of a&b = "+mod);
		Math.multiplyExact(div, mod);
		
	}

}
