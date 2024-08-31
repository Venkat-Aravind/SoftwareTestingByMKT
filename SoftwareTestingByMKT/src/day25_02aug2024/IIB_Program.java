package day25_02aug2024;
//Order of Execution: SIB,MainMethod, IIB
public class IIB_Program {
	{//IIB
		System.out.println("IIB");
	}
	static {//SIB
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new IIB_Program();
	}

}
