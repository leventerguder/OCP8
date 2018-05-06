package ch12;

public class QX29 {

}

class Dinosaur {
	class Pterodacty {

	}

	public static void main(String[] args) {
		Dinosaur dino = new Dinosaur();
		dino.new Pterodacty();
	}
}

// Let’s say Dinosaur is a class that contains a public member inner class
// called Pterodactyl. Given that dino is an instance of Dinosaur, how would you
// instantiate a new Pterodactyl from within a static method, such as main()?

// A. new Pterodactyl();
// B. dino.Pterodactyl();
// C. Dinosaur.new Pterodactyl();
// D. dino.new Pterodactyl();