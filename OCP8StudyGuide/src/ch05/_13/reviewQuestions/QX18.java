package ch05._13.reviewQuestions;

import java.util.Properties;

public class QX18 {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("key1", "value1");
		props.setProperty("key2", "value2");
		//
		props.keySet().stream().map(k -> props.get(k)).forEach(System.out::println);

		// public String getProperty(String key) {
		// public String getProperty(String key, String defaultValue) {
	}

}
