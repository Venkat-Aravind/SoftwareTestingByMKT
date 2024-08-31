//"Assignment 38: Create an Array of Double data type and take the input from Scanner class"
package assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment038 {
	public static void main(String[] args) {
		double rollno[] = new double[3];
		Scanner s1= new Scanner(System.in);
		for(int i=0;i<rollno.length;i++) {
			rollno[i] = s1.nextDouble();
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}
}
