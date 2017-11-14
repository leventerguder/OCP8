package _03.library;

interface Jukebox {
	public default String rock() {
		return "... all over the world!";
	}
}

interface Carriage {
	public default String rock() {
		return "... from side to side";
	}
}

public class DiamondProblem implements Jukebox, Carriage{

	@Override
	public String rock() {
		return Carriage.super.rock();
	}

}
