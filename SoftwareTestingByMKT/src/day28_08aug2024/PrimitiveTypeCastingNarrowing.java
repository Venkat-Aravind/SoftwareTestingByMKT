package day28_08aug2024;

public class PrimitiveTypeCastingNarrowing {

	public static void main(String[] args) {
		int a = (int) 67.67;//narrowing
		System.out.println(a);
		double wt = 88.8;
		int wt1 = (int) wt;//narrowing
		System.out.println(wt1);
	}
}
//write your age in byte datatype and convert that to short datatype