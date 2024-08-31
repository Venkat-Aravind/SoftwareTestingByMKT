package day17_23jul2024;

public class StringFunction1 {

	public static void main(String[] args) {
		String a = "my name is Aravind";
		String b = "my name is Aravind";
		System.out.println(a.trim());
		System.out.println(b.trim());
		
		String name = "Abhishek";
		String name1 = "abhishek";
		System.out.println(name.equals(name1));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name.concat(name1));
	}

}
