//"Assignment 42: WAP to find out average of an array of int data type whose size is 4?"
package assignments;
public class Assignment042 {
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		int sum = 0;
//		int length = a.length;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		int avg = sum/a.length;
		System.out.println("Average is: "+avg);
	}
}
