package mock;

abstract class BaseQX61 {
	public abstract Number getValue();
}

class Deri61 extends BaseQX61 {
//	public Integer getValue() {
//		return new Integer(10);
//	}
	
	public java.util.concurrent.atomic.AtomicInteger getValue() {
		return new java.util.concurrent.atomic.AtomicInteger(10);
	}
	
}

public class QX61 {

}
