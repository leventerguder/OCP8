package _02.stream;

public class Artist {

	private String name;
	private String from;
	
	public Artist(String name, String from) {
		super();
		this.name = name;
		this.from = from;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", from=" + from + "]";
	}
}
