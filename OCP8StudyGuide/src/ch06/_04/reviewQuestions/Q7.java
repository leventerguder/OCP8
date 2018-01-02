package ch06._04.reviewQuestions;

class Q7 {
	public static void main(String[] args) {
		if (args.length <= 3)
			assert false;
		System.out.println(args[0] + args[1] + args[2]);
	}
}

// java Q7 hi  -> The code throws an ArrayIndexOutOfBoundsException.