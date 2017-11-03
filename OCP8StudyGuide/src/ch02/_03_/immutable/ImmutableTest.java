package ch02._03_.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableTest {

	public static void main(String[] args) {
		Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));

		List<String> favoriteFoods = new ArrayList<String>();
		for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}

		Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);
		
		System.out.println(lion);
		System.out.println(updatedLion);
		
		//java.lang.UnsupportedOperationException
		//Collections.unmodifiableList(favoriteFoods);
		//lion.getFavoriteFoods().add("exception!");
	}
}
