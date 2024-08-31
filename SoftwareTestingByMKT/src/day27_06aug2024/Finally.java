package day27_06aug2024;

public class Finally {
	public static void main(String[] args) {
		int rollno[] = new int[3];
		rollno[0] = 85;
		rollno[1] = 96;
		rollno[2] = 55;
		try {
			rollno[3] = 21;
		} catch(ArrayIndexOutOfBoundsException a1) {
			
		}
		finally {
			System.out.println("Thanks for using");
		}
		System.out.println("The RollNos are: ");
 	}

}
/*
 * 
*/
