package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX31 {

	public Path rebuild(Path p) {
		Path v = null;
		for (int i = 0; i < p.getNameCount(); i++)
			if (v == null)
				v = p.getName(i);
			else
				v = v.resolve(p.getName(i));
		return v;
	}

	public static void main(String[] args) {

		QX31 al = new QX31();
		Path original = Paths.get("/tissue/heart/chambers.txt");
		Path repaired = al.rebuild(original);
		System.out.print(original.equals(repaired));
		
	}
}
