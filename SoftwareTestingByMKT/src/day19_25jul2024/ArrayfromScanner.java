//how to pass value of array from scanner class
package day19_25jul2024;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayfromScanner {
	public static void main(String[] args) {
		int rollno[] = new int[3];
		Scanner s1= new Scanner(System.in);
		for(int i=0;i<rollno.length;i++) {
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}