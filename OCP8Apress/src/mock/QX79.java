package mock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QX79 {

	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String integer = br.readLine();
		//
		int val = Integer.parseInt(integer);
		System.out.println(val);
	}
}
