package ch02._03_.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Animal { // 5. Prevent methods from being overridden.

	// 2. Mark all of the instance variables private and final.
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	// 1. Use a constructor to set all properties of the object.
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		// 4. Don’t allow referenced mutable objects to be modified or accessed
		// directly.
		// ! It is important when creating immutable objects that any mutable
		// input arguments are copied to the instance instead of being used
		// directly.
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public List<String> getFavoriteFoods() {
		// MAKES CLASS MUTABLE!
		// you should never share references to a mutable object contained
		// within an immutable object
		// return favoriteFoods;
		// fixed!
		return Collections.unmodifiableList(favoriteFoods);
	}

	// 3. Don’t define any setter methods.
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + ", favoriteFoods=" + favoriteFoods + "]";
	}
}
