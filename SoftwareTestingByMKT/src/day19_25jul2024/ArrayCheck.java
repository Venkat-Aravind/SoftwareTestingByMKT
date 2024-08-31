//In a array of size 4 of int datatype the values are 100,200,300,400
//check if the given number is part of array or not
package day19_25jul2024;
public class ArrayCheck {
	public static void main(String[] args) {
		int []rollno=new int[5];
		rollno[0]=12;
		rollno[1]=21;
		rollno[2]=23;
		rollno[3]=43;
		rollno[4]=33;
		int givennumber=23;
		for(int i=0;i<rollno.length;i++) {
			if(givennumber==rollno[i]) {
				System.out.println("Given number is a part of the array at the index position ->"+i);
			} else {
				System.out.println("Sorry Not Found");
			}
		}
	}
}
