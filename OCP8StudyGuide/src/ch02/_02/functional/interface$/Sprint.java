package ch02._02.functional.interface$;

@FunctionalInterface
public interface Sprint {
	public void sprint();
}

@FunctionalInterface
interface Run extends Sprint {
}

@FunctionalInterface
interface SprintFaster extends Sprint {
	@Override
	public void sprint();
}

@FunctionalInterface
interface Skip extends Sprint {
	default int getHopCount() {
		return 10;
	}

	public static void skip(int speed) {
	}
}
