package day16_22jul2024;

public class This_Keyword {
	int age;
	String name;
	String salary;
	void details(int age, String name, double salary) {
		this.age=age;//this.global_variable=local_variable;
		System.out.println("Students");
	}
	public static void main(String[] args) {
		This_Keyword t1 = new This_Keyword();
		t1.details(45, "Sham", 8574.32);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}
}
