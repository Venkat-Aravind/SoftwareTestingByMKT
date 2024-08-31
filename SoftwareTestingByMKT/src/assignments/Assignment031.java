//"Assignment 31: WAP on this keyword"
package assignments;
public class Assignment031 {
	int age;
	String name;
	String salary;
	void details(int age, String name, double salary) {
		this.age=age;//this.global_variable=local_variable;
		System.out.println("Students");
	}
	public static void main(String[] args) {
		Assignment031 t1 = new Assignment031();
		t1.details(45, "Sham", 8574.32);
		System.out.println(t1.age);//age=45 as we used this keyword
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}
}