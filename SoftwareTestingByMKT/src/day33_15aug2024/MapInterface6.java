package day33_15aug2024;

import java.util.HashMap;
import java.util.Map;

public class MapInterface6 {

	public static void main(String[] args) {
		Map<Integer, Double>m1=new HashMap<Integer, Double>();
		m1.put(7854, 85478.3);
		m1.put(8574, 95478.3);
		m1.put(7421, 52365.9);
		m1.put(9632, 45214.8);
		m1.putIfAbsent(9636, 85245.8);
		System.out.println(m1);
	}

}
