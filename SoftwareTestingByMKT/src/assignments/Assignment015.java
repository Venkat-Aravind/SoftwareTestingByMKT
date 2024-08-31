//"Assignment 15: WAP on if condition 2 Genders Male and Female if Female travelling is free 
//if Male then less than equals to 12 then half ticket more than 12 till 59 then full ticket
//else more than 60 then senior citizen ticket"
package assignments;
import java.util.Scanner;
public class Assignment015 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your gender (Male/Female): ");
        String gender = s1.next().toLowerCase();
        
        System.out.print("Enter your age: ");
        int age = s1.nextInt();
        
        if (gender.equals("female")) {
            System.out.println("Travelling is free");
        } else if (gender.equals("male")) {
            if (age <= 12) {
                System.out.println("Half Ticket");
            } else if (age > 12 && age <= 59) {
                System.out.println("Full Ticket");
            } else {
                System.out.println("Senior Citizen Ticket");
            }
        } else {
            System.out.println("Invalid input. Please enter Male or Female as gender.");
        }
	}
}
