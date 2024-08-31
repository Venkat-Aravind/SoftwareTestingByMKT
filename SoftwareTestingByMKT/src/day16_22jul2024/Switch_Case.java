package day16_22jul2024;

import java.util.Scanner;

public class Switch_Case {
	
	public static void main(String[] args) {
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for Edge");
		System.out.println("Press 3 for FireFox");
		Scanner s1=new Scanner(System.in);
		int browser_selection=s1.nextInt();
		switch(browser_selection) {
		case 1: System.out.println("Launch Chrome Browser");
			break;
		case 2: System.out.println("Launch Edge Browser");
			break;
		case 3: System.out.println("Launch FireFox Browser");
			break;
		default: System.out.println("Sorry your selection is wrong");
		}
	}

}
