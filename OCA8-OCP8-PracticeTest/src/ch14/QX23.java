package ch14;

import java.util.List;
import java.util.ArrayList;

public class QX23 {

	public static void main(String[] args) {
		
		final List<Boss> bosses = new ArrayList(8);
		bosses.add(new Boss("Jenny"));
		bosses.add(new Boss("Ted"));
		bosses.add(new Boss("Grace"));
		//bosses.removeIf(s -> s.equalsIgnoreCase("ted"));
		bosses.removeIf(s -> s.getName().equalsIgnoreCase("ted"));
		System.out.print(bosses);
	}
}

class Boss {
	private String name;

	public Boss(String name) {
		this.name = name;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public String toString() {
		return getName();
	}
}