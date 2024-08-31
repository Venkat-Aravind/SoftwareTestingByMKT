package day08_10jul2024;

public class FinalVariable {
	final static double pi = 3.14;
	static void area_of_circle()
	{
		final int r=7;
		 double area=(pi*r)*(pi*r);
		 System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int age=90;
		//age=91;//(can't change age as it is final
		System.out.println(age);
		area_of_circle();

	}

}
