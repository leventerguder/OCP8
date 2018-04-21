package ch02._06.reviewQuestions;

import java.util.List;

// What changes need to be made to make the following immutable object pattern correct?
public class Q7 {
	String name;
	private final List<Q7> friends;

	public Q7(String name, List<Q7> friends) {
		this.name = name;
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public List<Q7> getFriends() {
		return friends;
	}
}
// C. Mark name final and private.
// Replace the getFriends() method with methods that do not give the caller
// direct access to the List<Seal> friends.
// G. Make a copy of the List<Seal> friends in the constructor.
// H. Mark the Seal class final.