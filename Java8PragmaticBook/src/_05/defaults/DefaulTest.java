package _05.defaults;

interface Cool {
	
	default void test() {
		System.out.println("Cool#test");
	}
	
}

class SubCool implements Cool {
	
	@Override
	public void test() {
		System.out.println("SubCool#test");
	}
}


public class DefaulTest {

	public static void main(String[] args) {
		Cool cool = new SubCool();
		cool.test();
		
		Cool cool2 = new Cool() {
		};
		
		cool2.test();
		
		System.out.println(cool2.getClass().getName());
		System.out.println(cool.getClass().getName());
	}
}
