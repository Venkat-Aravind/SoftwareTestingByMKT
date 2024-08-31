package day08_10jul2024;

public class LocalGlobal {
	int b = 100;
	int c;//Default value 0
	LocalGlobal()
	{
		int a =10;//Local Variable
		System.out.println(a);
	}
	void add()
	{
		int a = 10;//Local Variable
		char b = 'c';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalGlobal a1 = new LocalGlobal();
		a1.add();

	}

}
