//"Assignment 56: WAP to showcase the Encapsulation using String data type"
package assignments;
class PrivateInfo {
	private String name = "Venkata";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Assignment056 {
	public static void main(String[] args) {
		PrivateInfo p = new PrivateInfo();
		p.setName("Aravinda");
		System.out.println(p.getName());
	}
}