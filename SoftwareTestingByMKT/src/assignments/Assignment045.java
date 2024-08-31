//Assignment 45: WAP to check if given 2 strings are anagram of each other. 
package assignments;
import java.util.Arrays;
public class Assignment045 {
	public static void main(String[] args) {
		String name = "face";
		String name2= "cafe";
		char[] c1=name.toCharArray();
		char[] c2=name2.toCharArray();
		    System.out.println(c1);
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean ans=Arrays.equals(c1, c2);
			System.out.println(ans);
			if(ans==true) {
				System.out.println("given string is anagram");
			}
			else {
				System.out.println("given string is not anagram");
			}	
		}
}