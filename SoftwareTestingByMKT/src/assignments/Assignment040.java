//"Assignment 40: WAP to copy the value of Array into another array?"
package assignments;
import java.util.Arrays;
public class Assignment040 {
	public static void main(String[] args) {
		double Esalary[]=new double[3];
		Esalary[0]=7185.23;
		Esalary[1]=7485.23;
		Esalary[2]=7885.23;
		double Msalary[]=new double[3];
		for(int i=0;i<Esalary.length;i++)
		{
		Msalary[i]	=	Esalary[i];
				
		}
		System.out.println("Old array is-> ");
		System.out.println(Arrays.toString(Esalary));
		System.out.println("After copying the new array is-> ");
		System.out.println(Arrays.toString(Msalary));
	}
}