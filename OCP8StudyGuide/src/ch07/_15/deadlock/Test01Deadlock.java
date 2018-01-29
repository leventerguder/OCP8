package ch07._15.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Food {
}

class Water {
}

class Fox {
	public void eatAndDrink(Food food, Water water) {
		synchronized (food) {
			System.out.println("Got Food!");
			move();
			synchronized (water) {
				System.out.println("Got Water!");
			}
		}
	}

	public void drinkAndEat(Food food, Water water) {
		synchronized (water) {
			System.out.println("Got Water!");
			move();
			synchronized (food) {
				System.out.println("Got Food!");
			}
		}
	}

	public void move() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// Handle exception }
		}
	}
}

public class Test01Deadlock {

	public static void main(String[] args) {

		Fox foxy = new Fox();
		Fox tails = new Fox();
		Food food = new Food();
		Water water = new Water();
		//
		ExecutorService service = Executors.newScheduledThreadPool(10);
		service.submit(() -> foxy.eatAndDrink(food, water));
		service.submit(() -> tails.eatAndDrink(food, water));
		
		service.shutdown();
	}
}
