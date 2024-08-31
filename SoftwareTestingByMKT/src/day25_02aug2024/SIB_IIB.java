package day25_02aug2024;

public class SIB_IIB {
	static {//SIB
		System.out.println("SIB");
	}
	SIB_IIB() {//CONSTRUCTOR
		System.out.println("Constructor");
	}
	SIB_IIB(int a) {//CONSTRUCTOR
		System.out.println("Constructor 1");
	}
	{//IIB
		System.out.println("IIB");
	}
	{//IIB
		System.out.println("IIB 1");
	}
	public static void main(String[] args) {//MAIN METHOD
		System.out.println("Main Method");
		new SIB_IIB();
		new SIB_IIB(5);
	}

}
