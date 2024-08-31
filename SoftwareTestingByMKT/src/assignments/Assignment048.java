//Assignment 48 Take size from scanner class n get two exception
//one for nextInt other for ArrayOutOfBoundException Handled it using try catch
package assignments;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment048 {
	public static void main(String[] args) {
             int rollno[]= new int [3];
             Scanner s1 = new Scanner(System.in);         
            System.out.println("please enter the array index values");            
	try {
		for(int i=0; i<rollno.length+1;i++) {		
            rollno[i]=s1.nextInt();                
	    }
		System.out.println(Arrays.toString(rollno));
	}            
	catch(InputMismatchException i1) {    //handled nextInt Exception
		System.out.println("please enter numeric values only");
	}	
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("index not valid");
		}
	s1.close();
	} 
}