package ch12;

public class QX38 {

	public static void main(String[] args) {
		abstract class Robot {
		}
		//
		class Transformer extends Robot implements Toy {
			public String name = "GiantRobot";

			public String play() {
				return "DinosaurRobot";
			}
		}

		Transformer prime = new Transformer() {
			public String play() {
				return name;
			} // y1
		};

		System.out.print(prime.play());
		// System.out.print(prime.play() + " " + name);
	}
}

interface Toy {
	String play();
}