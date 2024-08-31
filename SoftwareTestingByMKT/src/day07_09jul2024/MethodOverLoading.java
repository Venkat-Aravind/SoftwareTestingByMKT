package day07_09jul2024;
public class MethodOverLoading 
{
	 void add(int a)
	{
		System.out.println(a);
	}
	 void add()
	{
		System.out.println("1");
	}
	 void add(String a)
	{
		System.out.println(a);

	}
	 void add(String a,char b,double c)
	{
		System.out.println("4");

	}
	 static void add(boolean a)
	 {
		 System.out.println(a);
	 }
	public static void main(String[] args) 
	{
	/*	add();
		add(100);
		add("mkt");
		add("suresh",'C',3.14);
		*/
		MethodOverLoading d1=new MethodOverLoading();
		d1.add();
		d1.add(100);
		d1.add("mkt");
		d1.add("suresh", 'C', 3.14);
		add(false);
		
	}

}
