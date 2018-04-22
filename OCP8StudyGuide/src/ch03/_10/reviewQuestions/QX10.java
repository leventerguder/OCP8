package ch03._10.reviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class QX10 implements Comparator<String> {
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}

	public static void main(String[] args) {
		String[] values = { "123", "Abb", "aab" };
		Arrays.sort(values, new QX10());
		for (String s : values)
			System.out.print(s + " ");
	}
}
