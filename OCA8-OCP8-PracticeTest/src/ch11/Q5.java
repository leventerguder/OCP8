package ch11;

public class Q5 {

}
// Which method can be correctly inserted into this class to meet the contract
// of the equals() method? You may assume that text is not null.

class Button {
	private String text;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Button))
			return false;
		Button b = (Button) o;
		return text.equals(b.text);
	}

}