package day27_06aug2024;
public class tryCatchArray {
	public static void main(String[] args) {
		int rollno[] = new int[3];
		rollno[0] = 85;
		rollno[1] = 96;
		rollno[2] = 55;
		try {
			rollno[3] = 21;
		} catch(ArrayIndexOutOfBoundsException a1) {
			
		}
		System.out.println("The RollNos are: ");
 	}

}
/*
 * int rollno[] = new int[3];
 * rollno[0] = 85;
 * rollno[1] = 96;
 * rollno[2] = 55;
 * where size is coming from scanner class
 * try to get 2 exception one from nextint and other for outbound.
 * handle it carefully to avoid termination
 */