package ch02._04.singleton;

public class CheetahManager {

	private static CheetahManager cm;

	private CheetahManager() {
	}

	public static synchronized CheetahManager getInstance() {
		if (cm == null) {
			cm = new CheetahManager();
		}
		return cm;
	}
}
