package day28_08aug2024;

public class PrimitiveTypeCastingWidning {

	public static void main(String[] args) {
		int a = 100;
		double b1 = a;//implicit widning
		System.out.println(b1);
		int b = 100;
		double b2 = (double)b;//explicit widning
		System.out.println(b2);
	}

}
