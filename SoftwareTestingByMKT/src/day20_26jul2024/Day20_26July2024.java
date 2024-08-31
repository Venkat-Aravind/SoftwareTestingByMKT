//find the average value of an array of int datatype of size 4 and the values that they have are 17,35,81,42

// Find out if the given string starts with 'r' or not?
//find out 
package day20_26jul2024;

import java.util.Arrays;

public class Day20_26July2024 {
	public static void main(String[] args) {
		int nos[]=new int[4];
		nos[0]=17;
		nos[1]=35;
		nos[2]=81;
		nos[3]=42;
		double sum=0;
		for(int i=0;i<nos.length;i++) {
			sum=sum+nos[i];
		}
		double average = sum/4;
		System.out.println(average);
	}

}
