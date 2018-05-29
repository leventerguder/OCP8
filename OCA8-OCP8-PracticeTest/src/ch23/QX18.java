package ch23;

import java.io.Console;

public class QX18 {
	public static void main(String[] webLogin) {
		String pass = new Login().getPassword();
	}
}

// I. The class compiles.
// III. The class may throw an exception at runtime.

class Login {

	public void clearPassword(char[] password) {
		for (int i = 0; i < password.length; i++) {
			password[i] = 0;
		}
	}

	public String getPassword() {
		Console c = System.console();
		final char[] pass = c.readPassword("Enter your password: ");
		StringBuilder sb = new StringBuilder();
		for (char p : pass) {
			sb.append(p);
		}
		clearPassword(pass);
		return sb.toString();
	}
}