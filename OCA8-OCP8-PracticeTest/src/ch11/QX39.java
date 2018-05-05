package ch11;

public class QX39 {

	public static void main(String[] args) {
		BuildingQX39 b = new BuildingQX39();
		HouseQX39 h = new HouseQX39();
		BuildingQX39 bh = new HouseQX39();
		HouseQX39 p = (HouseQX39) b;
		HouseQX39 q = (HouseQX39) h;
		HouseQX39 r = (HouseQX39) bh;
	}

}

class BuildingQX39 {
}

class HouseQX39 extends BuildingQX39 {
}

// Which variable declaration is the first line to throw a ClassCastException at
// runtime?