package ch14;

import java.util.function.Consumer;

public class QX35 {

}

class Sheep {
}

class Dream {
	int MAX_SHEEP = 10;
	int sheepCount;

	public void countSheep(Consumer<Sheep> backToSleep) {

	}

	public static void main(String[] args) {
		new Dream().countSheep(System.out::println);
	}
}