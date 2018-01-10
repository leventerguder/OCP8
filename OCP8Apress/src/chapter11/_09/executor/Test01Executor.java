package chapter11._09.executor;

import java.util.concurrent.Executor;

class ExecutorImplementation implements Executor {

	@Override
	public void execute(Runnable command) {
		new Thread(command).start();
		System.out.println("ExecutorImplementation#execute..." + Thread.currentThread().getName());
	}

}

class MyTaskRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyTask#run..." + Thread.currentThread().getName());

	}

}

public class Test01Executor {

	public static void main(String[] args) {
		Runnable r1 = new MyTaskRunnable();
		//
		Executor exec = new ExecutorImplementation();
		exec.execute(r1);
	}
}
