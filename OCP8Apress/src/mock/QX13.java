package mock;

class base1 {
	protected int var;
}

interface base2 {
	int var = 0; // #1
}

public class QX13 extends base1 implements base2 {

	public static void main(String[] args) {
		//The field var is ambiguous
		//System.out.println(var);
	}
}
