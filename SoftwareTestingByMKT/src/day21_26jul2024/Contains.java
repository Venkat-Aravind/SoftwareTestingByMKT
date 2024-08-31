package day21_26jul2024;

import java.util.Arrays;

public class Contains {
	public static void main(String[] args) {
		String a1="Manish Kumar Tiwari";
		String a3="";
		boolean answer = a1.contains("Tiwari");
		System.out.println(answer);
		String []name = a1.split(" ");
		System.out.println(Arrays.toString(name));
		//String []name1=a1.splitWithDelimiters(" ", 3);
		//System.out.println(Arrays.toString(name1));
		String []name2=a1.split(" ", 1);
		System.out.println(Arrays.toString(name2));
		String a2="school";
		//System.out.println(a2.repeat(3));
		System.out.println(a1.endsWith("i"));
		System.out.println(a3.isEmpty());
	}
}
