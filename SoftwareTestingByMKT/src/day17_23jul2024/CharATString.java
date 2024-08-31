//program to print seperate characters in a string
package day17_23jul2024;

import java.util.Scanner;

public class CharATString {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		for(int i=0;i<name.length();i++) {
		char n = name.charAt(i);
		System.out.print(n+" ");
		s1.close();
		}
	}
}
//Please create an array for int datatype to store the rollno of 3 students
//int rollno[] = new int[3];
//rollno[0] = 10;
//rollno[1] = 15;
//rollno[2] = 20;
//Please create an array for String Datatype to store the names of 3 students   
//String name[] new String[3];
//name[0] = "ujwala";
//name[1] = "venkata";
//name[2] = "Aravind";