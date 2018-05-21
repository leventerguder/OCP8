package ch19;

import java.nio.file.*;

public class QX35 {

	public static void main(String[] args) {
		Path halleysComet = Paths.get("stars/./rocks/../m1.meteor").normalize();
		System.out.println(halleysComet);

		Path lexellsComet = Paths.get("./stars/../solar/");
		lexellsComet = lexellsComet.subpath(0, 2).resolve("m1.meteor").normalize();

		System.out.print(halleysComet.equals(lexellsComet) ? "Same!" : "Different!");

	}
}
