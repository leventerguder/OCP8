package ch11;

public class QX18 {
	public void convert() {
		Building b = new Building();
		House h = new House();
		Building bh = new House();
		Building p = (House) b;
		// House q = (Building) h; //compiler error
		Building r = (Building) bh;
		House s = (House) bh;
	}
}

class Building {
}

class House extends Building {
}