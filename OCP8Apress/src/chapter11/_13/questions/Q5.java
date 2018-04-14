package chapter11._13.questions;

import java.util.concurrent.Callable;

public class Q5 {

}

class CallableTask implements Callable<Integer> {

	@Override
	public Integer call() {
		System.out.println("Callable.call()");
		return 0;
	}
}
