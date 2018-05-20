package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX15 {

	public boolean findHome() {
		Path oftenTraveled = Paths.get("/highway/street/spot.txt");
		Path lessTraveled = Paths.get("/highway/street/house/../.");
		lessTraveled.resolve("spot.txt");
		return oftenTraveled.equals(lessTraveled.normalize());
	}

	public static void main(String... emerald) {
		System.out.print("AM I HOME? " + (new QX15().findHome() ? "yes" : " no"));
	}
}
