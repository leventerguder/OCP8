package ch11;

public class QX27 {

}

class ButtonQX27 {

	private String text;

	public int hashCode() {
		return text.hashCode();
	}

	public boolean equals(Object o) {
		if (!(o instanceof ButtonQX27))
			return false;
		ButtonQX27 b = (ButtonQX27) o;
		return text.equals(b.text);
	}

}