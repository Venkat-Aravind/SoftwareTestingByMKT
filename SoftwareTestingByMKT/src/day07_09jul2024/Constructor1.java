package day07_09jul2024;
public class Constructor1 {
	Constructor1(){
		//this is your constructor(Non-Parameterized)
		System.out.println("This is Constructor - Constructor1");
	}
	Constructor1(int a) {
		//this is your constructor(Parameterized)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 a1 = new Constructor1();
		new Constructor1();//calling non-parameterized constructor
		new Constructor1(10);// calling parameterized constructor
	}
}