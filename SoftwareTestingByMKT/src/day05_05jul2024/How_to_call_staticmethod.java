package day05_05jul2024;

public class How_to_call_staticmethod {
	static void addition(int a, int b) {
		int sum = a+b;
		System.out.println("I am addition method");
		System.out.println(sum);
	}
	static void subtraction() {
		System.out.println("I am subtraction method");
	}
	static void multiply() {
		System.out.println("I am multiply method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am your main method");
		addition(7,8);
		addition(5,6);
		subtraction();

	}

}
