package chapter07._03_questions;

import java.sql.SQLException;

class CustomSQLException extends SQLException {
}

class BaseClass {
	void foo() throws SQLException {
		throw new SQLException();
	}
}

class DeriClass extends BaseClass {
	public void foo() throws CustomSQLException {
		throw new CustomSQLException();
	}
}

public class Q6 {

	public static void main(String[] args) {
		try {
			BaseClass base = new DeriClass();
			base.foo();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
