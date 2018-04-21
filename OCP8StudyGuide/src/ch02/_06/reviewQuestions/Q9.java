package ch02._06.reviewQuestions;

public class Q9 {
	public static Q9 cheetahManager;

	private Q9() {
	}

	public static Q9 getCheetahManager() {
		if (cheetahManager == null) {
			cheetahManager = new Q9();
		}
		return cheetahManager;
	}
}

// D. Change the access modifier of cheetahManager from public to private.
// F. Add synchronized to getCheetahManager().