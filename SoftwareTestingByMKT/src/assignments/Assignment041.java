//"Assignment 41: WAP to reverse an Array"
package assignments;
import java.util.Arrays;
public class Assignment041 {
	public static void main(String[] args) {
		int oldarray[]=new int[3];
		oldarray[0]=71;
		oldarray[1]=6;
		oldarray[2]=78;
		int reverse_array[]=new int[3];
		for(int i=0,k=reverse_array.length-1;i<oldarray.length;i++,k--) {
		reverse_array[k]	=		oldarray[i];
		}
		System.out.println(Arrays.toString(oldarray));
		System.out.println(Arrays.toString(reverse_array));		
	}
}