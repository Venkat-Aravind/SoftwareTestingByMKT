//"Assignment 57: WAP to showcase the Encapsulation using Int data type"
package assignments;
class PrivateIn
{
	private int AccountNumber = 123456;
	public void setAccountNumber(int number) {
		this.AccountNumber = number;
	}	
	public int getAccountNumber() {
		return AccountNumber; //return in int datatype
	}	
}
public class Assignment057 {
	public static void main(String[] args) {
		PrivateIn pr = new PrivateIn();
		pr.setAccountNumber(1545);
		System.out.println(pr.getAccountNumber());
	}
}