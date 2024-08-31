package day33_15aug2024;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Map_Interface4 {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 90);
		m1.put("Swati", 93);
		m1.put("Anusha", 90);
		Set<String> s1 = m1.keySet();
		System.out.println(s1);
		for(String s2: m1.keySet()) {
			System.out.println(s2);
		}
		for(Integer i1: m1.values()) {
			System.out.println(i1);
		}
		for(Map.Entry<String, Integer> e1 : m1.entrySet()) {
			System.out.println(e1);
		}
		Iterator<Entry<String, Integer>> i2 = m1.entrySet().iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
