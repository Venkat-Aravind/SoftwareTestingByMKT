package day11_15jul2024;
import java.util.Scanner;
public class OrOperator {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		if(a==10 || b==a)//Or Operator
		{
			System.out.println("Learning OR");
		}
		if(a==10 && b==a)//AND Operator
		{
			System.out.println("Learning OR");
		}
		if(!(a==10 || b==a))//Not Operator
		{
			System.out.println("Learning OR");
		}
	}
}
