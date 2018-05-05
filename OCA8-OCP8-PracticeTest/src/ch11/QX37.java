package ch11;

public class QX37 {
	public static void main(String[] args) {
		new HowMany();
		new HowMany();
	}
}

class HowMany {
	static {
		System.out.println("any");
	}
	{
		System.out.println("more");
	}

}