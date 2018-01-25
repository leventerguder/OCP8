package mock;

interface EnumBase {
}

enum AnEnum implements EnumBase { // IMPLEMENTS_INTERFACE
	ONLY_MEM;
}

public class QX11 {
	public static void main(String[] args) {
		if (AnEnum.ONLY_MEM instanceof AnEnum) {
			System.out.println("yes, instance of AnEnum");
		}
		if (AnEnum.ONLY_MEM instanceof EnumBase) {
			System.out.println("yes, instance of EnumBase");
		}
		if (AnEnum.ONLY_MEM instanceof Enum) { // THIRD_CHECK
			System.out.println("yes, instance of Enum");
		}
	}
}
// yes, instance of AnEnum
// yes, instance of EnumBase
// yes, instance of Enum
