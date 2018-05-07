package ch13;

interface Comic<C> {
	void draw(C c);
}

class ComicClass<C> implements Comic<C> {
	@Override
	public void draw(C c) {
		System.out.println(c);
	}
}

class SnoopyClass implements Comic<Snoopy> {

	@Override
	public void draw(Snoopy c) {

	}

}

class Snoopy {

}

public class QX15 {
	public static void main(String[] args) {
		Comic<Snoopy> c1 = c -> System.out.println(c);
		Comic<Snoopy> c2 = new ComicClass();
		Comic<Snoopy> c3 = new SnoopyClass();
		// Comic<Snoopy> c4 = new SnoopyComic(); // compile error
	}
}
