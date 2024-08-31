//"Assignment 37: WAP to check if the two Arrays are equals to each other"
package assignments;
import java.util.Arrays;
public class Assignment037 {
	public static void main(String[] args) {
		int rollno[] = new int[4];
		int rollno1[] = new int[4];
		rollno[0]=90;
		rollno[1]=56;
		rollno[2]=12;
		rollno[3]=40;
		rollno1[0]=90;
		rollno1[1]=56;
		rollno1[2]=12;
		rollno1[3]=40;
		boolean b1 = Arrays.equals(rollno, rollno1);
		if(b1==true) {
			System.out.println("Both the arrays are equal");
		} else {
			System.out.println("Both the arrays are not equal");
		}
	}
}