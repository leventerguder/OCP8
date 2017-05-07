package _15.stringJoining;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		
		sj.add("levent");
		sj.add("ali");
		sj.add("mehmet");
		
		System.out.println(sj);
		System.out.println(sj.toString());
	}
}
