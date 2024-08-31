package day15_19jul2024;

public class this_calling_statement {
	this_calling_statement()
	{
		this(9);
		System.out.println("with no para");
	}
	this_calling_statement(int a)
	{	
		System.out.println("with a as int");
	}
	this_calling_statement(double a)
	{
	System.out.println("with a as double");
	}
	public static void main(String[] args) {
		new this_calling_statement();
	}

}
