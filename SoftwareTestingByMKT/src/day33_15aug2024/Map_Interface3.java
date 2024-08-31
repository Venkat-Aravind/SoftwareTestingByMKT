package day33_15aug2024;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface3 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 85);
		m1.put("Vinod", 74);
		m1.put("Hari", 90);
		System.out.println(m1);
//		m1.remove("Vinod");
//		System.out.println(m1);
		m1.replace("Hari", 93);
		System.out.println(m1);
		m1.replace("Vinod", 74, 79);
		System.out.println(m1);
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Swati", 85);
		m2.put("Pradeep", 86);
		m2.put("Priya", 87);
		m2.put("Anusha", 880);
		
	}

}
