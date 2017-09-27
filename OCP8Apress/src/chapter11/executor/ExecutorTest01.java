package chapter11.executor;

import java.util.concurrent.Executor;

class ExecutorImpl implements Executor {

	@Override
	public void execute(Runnable command) {
		System.out.println("ExecutorImpl#execute");
		command.run();
	}

}

class ThreadPerTaskExecutor implements Executor {

	public void execute(Runnable r) {
		System.out.println("ThreadPerTaskExecutor#execute");
		new Thread(r).start();
	}
}

class RunnableImpl implements Runnable {

	@Override
	public void run() {

		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());

	}

}

public class ExecutorTest01 {

	public static void main(String[] args) {
		Executor executor = new ExecutorImpl();
		
		Runnable r = new RunnableImpl();		
		executor.execute(r);
		
		Executor executorThreadPer = new ThreadPerTaskExecutor();
		executorThreadPer.execute(r);

	}
}
