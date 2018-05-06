package ch12;

public class QX39 {

}

class Leader {
}

class Follower {
}

abstract class Dancer {

	public Leader getPartner() {
		return new Leader();
	}

	abstract public Leader getPartner(int count); // u1
}

//abstract class SwingDancer extends Dancer {
//	public Follower getPartner() { // u2
//		return new Follower(); // u3 
//	}
//}