package day18_24jul2024;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String input="my name is aravind";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=		input.charAt(i);
		output=output+c1;
		}
		System.out.println("The reverse of the input is -> "+output);
	}
}
