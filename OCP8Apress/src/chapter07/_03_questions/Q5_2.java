package chapter07._03_questions;

import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.LoginException;

public class Q5_2 {

	public static void main(String[] args) {
		try {
			LoginException le = new AccountNotFoundException();
			throw (Exception) le;
		} catch (AccountNotFoundException anfe) {
			System.out.println("In the handler of AccountNotFoundException");
		} catch (AccountException ae) {
			System.out.println("In the handler of AccountException");
		} catch (LoginException le) {
			System.out.println("In the handler of LoginException");
		} catch (Exception e) {
			System.out.println("In the handler of Exception");
		}
	}
}
