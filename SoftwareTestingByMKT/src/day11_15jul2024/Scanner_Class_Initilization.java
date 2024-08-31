package day11_15jul2024;
import java.util.Scanner;
public class Scanner_Class_Initilization {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String a = s1.next();
		byte b = s1.nextByte();
		float c = s1.nextFloat();
		double d = s1.nextDouble();
		long e = s1.nextLong();
		boolean f = s1.nextBoolean();
		short g = s1.nextShort();
		int h = s1.nextInt();
	}
}
