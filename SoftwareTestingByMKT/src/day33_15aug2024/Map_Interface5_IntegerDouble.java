package day33_15aug2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface5_IntegerDouble {

	public static void main(String[] args) {
		Map<Integer, Double>m1=new HashMap<Integer, Double>();
		m1.put(7854, 85478.3);
		m1.put(8574, 95478.3);
		m1.put(7421, 52365.9);
		m1.put(9632, 45214.8);
		for(Integer i1: m1.keySet()) {
			System.out.println("EmployeeIds:"+i1);
		}
		for(Double i2: m1.values()) {
			System.out.println("Salaries:"+i2);
		}
		for(Entry<Integer,Double> e1: m1.entrySet()) {
			System.out.println("EmployeeId and Salary is: "+e1);
		}
		Iterator<Entry<Integer,Double>> i1 = m1.entrySet().iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
