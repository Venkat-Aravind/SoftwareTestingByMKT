//how to find out past,present and future time
//This can be done using date class
package day39_23aug2024;

import java.util.Date;

public class Day39_23August2024 extends Object
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String time=	d2.toString();
					
	String month=	time.substring(4, 7);
		System.out.println(month);
		String date=	time.substring(8, 10);
		System.out.println(date);
		String year=	time.substring(time.length()-4);
		System.out.println(year);
		
	String Dateformat1=	date.concat(month).concat(year);
		System.out.println(Dateformat1);
	String Dateformat2=	date.concat(" ").concat(month).concat(" ").concat(year);
	System.out.println(Dateformat2);

	String Dateformat3=	date.concat("-").concat(month).concat("-").concat(year);
	System.out.println(Dateformat3);
	
	String Dateformat4=	date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(Dateformat4);
	Day39_23August2024 d9=new Day39_23August2024();
	System.out.println(d9.getClass());
		
	}

}
