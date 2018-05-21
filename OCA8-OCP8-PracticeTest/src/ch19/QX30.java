package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX30 {

	public static void main(String[] args) {

		Path w1 = Paths.get("../jungle/.././rain..").toAbsolutePath().normalize();

		System.out.println(w1.resolve("snow.txt"));
	}
}
