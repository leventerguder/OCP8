package ch22;

import java.util.Map;
import java.util.TreeMap;
import java.util.Properties;

public class QX20 {

	public static void main(String[] args) {

		Map<Object, Object> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");

		Properties props = new Properties();
		map.forEach((k, v) -> props.put(k, v));

		String t = props.getProperty("tool");
		String n = props.getProperty("problem");
		System.out.println(t + " " + n);
	}
}
