//Assignment 26: Write a program on multilevel inheritance
package assignments;
class One {//One - Super most class
	static void add() {
		System.out.println("Supermostclass");
	}
}
class Two extends One{// Two - SuperClass(is inheriting from class One)
	static void sub() {
		System.out.println("Superclass");
	}
}
public class Assignment026 extends Two { // Assignment026 - Subclass(is inheriting from class Two)
	static void mul() {
		System.out.println("Subclass");
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
	}
}
