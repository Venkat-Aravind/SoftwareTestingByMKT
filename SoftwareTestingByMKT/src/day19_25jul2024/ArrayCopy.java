////how to copy the value of one array to another array
package day19_25jul2024;

import java.util.Arrays;

public class ArrayCopy {
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
