package ch12;

public class QX11 {

}

interface Drive {
	int SPEED = 5;

	default int getSpeed() {
		return SPEED;
	}
}

interface Hover {
	int MAX_SPEED = 5;

	default int getSpeed() {
		return MAX_SPEED;
	}
}

class Car implements Drive, Hover {
	public static void main(String[] gears) {
		class RaceCar extends Car {
			@Override
			public int getSpeed() {
				return 10;
			}
		}
		;
		System.out.print(new RaceCar().getSpeed());
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return Drive.super.getSpeed();
	}
}