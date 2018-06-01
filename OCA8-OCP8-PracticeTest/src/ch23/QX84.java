package ch23;

//public class QX84 {
//	public static void main(String[] strings) {
//		final class MyElectricBass extends ElectricBass {
//			public void strum() {
//				System.out.print("E");
//			}
//		}
//	}
//}

interface DoubleBass {
	void strum();

	default int getVolume() {
		return 5;
	}
}

interface BassGuitar {
	void strum();

	default int getVolume() {
		return 10;
	}
}

// compile error
//class ElectricBass implements DoubleBass, BassGuitar {
//	@Override
//	public void strum() {
//		System.out.print("A");
//	}
//}