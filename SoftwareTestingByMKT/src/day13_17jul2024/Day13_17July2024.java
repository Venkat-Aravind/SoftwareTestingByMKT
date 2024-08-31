package day13_17jul2024;
class Amazon
{
	static void loginwithmobileno()
	{
		System.out.println("Mobile no");
	}
	 void registartion()
	{
		System.out.println("registartion no");
	}
}
public class Day13_17July2024 extends Amazon
{
	static void loginwithemailid()
	{
		System.out.println("Email id");
	}
	 void logout()
	{
		System.out.println("logout");
	}
	public static void main(String[] args) 
	{
		loginwithemailid();
		loginwithmobileno();
		Day13_17July2024 d1=new Day13_17July2024();
		d1.registartion();
		d1.logout();
	}
}
