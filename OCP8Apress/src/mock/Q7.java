package mock;

class BaseQ7 {
	public void test() {
		//protected int a = 10; // #1 //compiler error!
	}
}

class Test extends BaseQ7 { // #2
	public static void main(String[] args) {
		System.out.printf(null); // #3
	}
}

public class Q7 {

}
