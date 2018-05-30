package ch23;

public class QX43 {

}

// Which are the minimum changes needed to properly implement the singleton
// pattern?

// I. Add a private constructor. (+)
// II. Remove the setter method.
// III. Remove the static block and change line 2 to instantiate Bookmark.

class Bookmark {
	private static Bookmark bookmark;
	private int pageNumber;

	static {
		bookmark = new Bookmark();
	}

	public static Bookmark getInstance() {
		return bookmark;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int newNumber) {
		pageNumber = newNumber;
	}
}