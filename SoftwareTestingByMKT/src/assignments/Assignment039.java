//Assignment 39: In an Array of int data type of size four the values are 100,200, 300 and 400.
//Check if the given number is a part of Array or not?
package assignments;
public class Assignment039 {
	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		int givennumber = 10;
		for(int i=0;i<a.length;i++) {
			if(givennumber==a[i]) {
				System.out.println("Given Number is part of Array");
			} else {
				System.out.println("Given Number is not part of Array");
			}
		}
	}
}
