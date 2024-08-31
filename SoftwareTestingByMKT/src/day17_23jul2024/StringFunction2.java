package day17_23jul2024;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunction2 {
	public static void main(String[] args) {
		System.out.println("Enter the no.of Students: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the roll no of students: ");
		int rollno[] = new int[n];
		for(int i=0;i<n;i++) {
			rollno[i] = sc.nextInt();
			Arrays.sort(rollno);
		}
		System.out.println(Arrays.toString(rollno));
//		String names[] = new String[n];
//		System.out.println("Enter the names of the students: ");
//		for(int j=0;j<n;j++) {
//			names[j] = sc.next();
//			Arrays.sort(names);
//		}
//		System.out.println(Arrays.toString(names));
	}

}
