package day21_29jul2024;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name="face";
		String name1="cafe";
		if(name.length()!=name1.length()) {
			System.out.println("NOT ANAGRAM");
		} else {
			char []c1= name.toCharArray();
			char []c2= name1.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean answer = Arrays.equals(c1, c2);
			System.out.println(answer);
			if(answer==true) {
				System.out.println("Both the given string are anagram to each other");
			} else {
				System.out.println("NOT ANAGRAM");
			}
		}
	}
}
