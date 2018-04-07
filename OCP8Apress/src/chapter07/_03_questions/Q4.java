package chapter07._03_questions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Q4 {
	public static void fooThrower() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void barThrower() throws SQLException {
		throw new SQLException();
	}

	public static void main(String[] args) {
		try {
			fooThrower();
			barThrower();
			// } catch(FileNotFoundException || SQLException multie) { //compiler error!
		} catch (FileNotFoundException | SQLException multie) {
			// not ||
			System.out.println(multie);
		}
	}
}
