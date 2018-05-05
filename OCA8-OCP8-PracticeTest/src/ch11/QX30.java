package ch11;

public class QX30 {
	public void convert() {
		BuildingQX30 b = new BuildingQX30();
		HouseQX30 h = new HouseQX30();
		BuildingQX30 bh = new HouseQX30();
		HouseQX30 p = (HouseQX30) b;
		HouseQX30 q = (HouseQX30) h;
		HouseQX30 r = (HouseQX30) bh;
	}
}

class BuildingQX30 {
}

class HouseQX30 extends BuildingQX30 {
}

// Which variable declaration is the first line not to compile?
// D None of the above