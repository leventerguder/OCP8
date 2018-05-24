package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX20 {

	public static void main(String[] args) {

		Path p1 = Paths.get("./found/../keys");
		Path p2 = Paths.get("/lost/blue.txt");
		//
		System.out.println(p1.resolve(p2));
		System.out.println(p2.resolve(p1));

	}
}

// lost/blue.txt
// lost/blue.txt/./found/../keys

//First off, p2 is an absolute path, which means that p1.resolve(p2) just returns p2. For
//this reason, Option B is incorrect. Since p1 is a relative path, it is appended onto p2, making
//Option C correct and Option A incorrect
