package ch16;

public class QX31 {
	
	//compiler error , Unhandled exception type Exception thrown by automatic close() invocation on timeSled
	//	public static void main(String[] twelve) {
	//		//
	//		try (TimeMachine timeSled = new TimeMachine(1);
	//				TimeMachine delorean = new TimeMachine(2);
	//				TimeMachine tardis = new TimeMachine(3)) {
	//		} catch (TimeException e) {
	//			System.out.print(4);
	//		} finally {
	//			System.out.print(5);
	//		}
	//	}
	
	public static void main(String[] twelve) throws Exception {
		//
		try (TimeMachine timeSled = new TimeMachine(1);
				TimeMachine delorean = new TimeMachine(2);
				TimeMachine tardis = new TimeMachine(3)) {
		} catch (TimeException e) {
			System.out.print(4);
		} finally {
			System.out.print(5);
		}
	}
}

class TimeException extends Exception {
}

class TimeMachine implements AutoCloseable {
	int v;

	public TimeMachine(int v) {
		this.v = v;
	}

	public void close() throws Exception {
		System.out.print(v);
	}
}