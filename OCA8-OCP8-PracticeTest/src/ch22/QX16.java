package ch22;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class QX16 {

	public static void main(String[] args) {
		//
		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");
		//
		Properties props = new Properties();
		map.forEach((k,v) -> props.put(k, v));
		//

		//public synchronized V get(Object key) {
		//String t = props.get("tool"); //compile error
		//String n = props.get("nail"); //compile error
		//System.out.println(t + " " + n);
	}
}
