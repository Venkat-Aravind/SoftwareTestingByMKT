package day26_05aug2024;
public class Try_Catch {
	public static void main(String[] args) {
		try {
			int c=1/0;
			System.out.println(c);
		} catch(ArithmeticException a1) {
			System.out.println("Handled the exception");
		}
	}

}
