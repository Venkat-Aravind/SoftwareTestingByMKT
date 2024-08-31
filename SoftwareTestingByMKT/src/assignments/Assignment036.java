//Assignment 36: WAP to find the number of alphabets,numbers,spaces in a string
package assignments;
public class Assignment036 {
	static int count_of_alphabet = 0;
	static int count_of_number = 0;
	static int count_of_space = 0;
	public static void main(String[] args) {
		String input = "Aravind@12131 ";
		char[] c1=		input.toCharArray();
		System.out.println("Finding Alphabets:");
		for(int i=0;i<input.length();i++) {
			boolean answer1 = Character.isAlphabetic(c1[i]);
			if(answer1==true) {
				count_of_alphabet++;
			}
		}
			System.out.println("The total alphabets are ->"+count_of_alphabet);
		System.out.println("Finding Numeric:");
		for(int i=0;i<input.length();i++) {
			boolean answer1 = Character.isDigit(c1[i]);
			if(answer1==true) {
				count_of_number++;
			}
		}
			System.out.println("The total numeric count is ->"+count_of_number);
		System.out.println("Finding spaces:");
		for(int i=0;i<input.length();i++) {
			boolean answer1 = Character.isSpaceChar(c1[i]);
			if(answer1==true) {
				count_of_space++;
			}
		}
			System.out.println("The total space count is ->"+count_of_space);
			System.out.println("Finding Special Chars:");
			int count = count_of_alphabet+count_of_number+count_of_space;
			int output = input.length()-count;
			System.out.println("The total special characters are ->"+output);
		}
}