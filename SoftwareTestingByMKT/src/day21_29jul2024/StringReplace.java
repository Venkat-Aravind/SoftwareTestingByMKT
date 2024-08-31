package day21_29jul2024;
public class StringReplace {
	public static void main(String[] args) {
		String a="Manish";
		String a1="Manish Kumar Tiwari";
		String a2="Avinash Yadav";
		String a3="Kv No 2 Bangalore";
//		System.out.println(a.replace('M', 'Z'));
//		System.out.println(a1.replace(" ",""));
		System.out.println(a2.replaceAll("[A-Z][a-z]",""));
//		System.out.println(a1.replaceAll("[a-z]",""));
//		System.out.println(a3.replaceAll("[0-9]",""));
//		System.out.println(a3.replaceAll("[A-Z][0-9]",""));
		
	}
}
