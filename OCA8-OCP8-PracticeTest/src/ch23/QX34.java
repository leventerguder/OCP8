package ch23;

public class QX34 {

}

// Which are the minimum changes needed to make this class immutable?
// I. Make species private and final. (+)
// II. Make the getter method final. (+)
// III. Remove the setter method. (+)

class Tree {
	String species;

	public Tree(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	private final void setSpecies(String newSpecies) {
		species = newSpecies;
	}
}