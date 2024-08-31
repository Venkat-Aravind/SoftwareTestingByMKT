//Assignment 49 WAP to handle the String Out Of Bound Exception using Exception Handling
package assignments;
public class Assignment049 {
	public static void main(String[] args) {
		String name = "Venkata";		
	   try{
	            char c1 = name.charAt(6);
	            System.out.println(c1);
			}	
		catch(StringIndexOutOfBoundsException s1)
		{
		System.out.println("Exception is handled");	
	}
	   finally{
		   System.out.println("Concept of handling StringOutOfBound");
	   }
}
}