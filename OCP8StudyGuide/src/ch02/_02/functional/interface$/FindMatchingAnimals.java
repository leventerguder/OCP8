package ch02._02.functional.interface$;

import java.util.function.Predicate;

public class FindMatchingAnimals {

	public static void main(String[] args) {
		Animal fish = new Animal("fish", false, true);
		Animal kangaroo = new Animal("kangaroo", true, false);
		//
		CheckTrait check1 = (Animal animal) -> animal.canHop();
		CheckTrait check2 = animal -> animal.canHop();
		//
		print(fish, check1);
		print(kangaroo, check2);

		//
		Predicate<Animal> predicate1 = (Animal animal) -> animal.canHop();
		Predicate<Animal> predicate2 = animal -> animal.canHop();

		printUsePredicate(fish, predicate1);
		printUsePredicate(kangaroo, predicate2);
	}

	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	private static void printUsePredicate(Animal animal, Predicate<Animal> predicate) {
		if (predicate.test(animal))
			System.out.println(animal);
	}

}
