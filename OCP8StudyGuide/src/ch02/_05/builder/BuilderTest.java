package ch02._05.builder;

import java.util.Arrays;

public class BuilderTest {

	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");

		Animal duck = duckBuilder.build();
		Animal flamingo = new AnimalBuilder().setFavoriteFoods(Arrays.asList("algae", "insects")).setSpecies("flamingo")
				.build();

		System.out.println(duck);
		System.out.println(flamingo);

	}
}
