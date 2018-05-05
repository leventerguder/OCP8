package ch11;

import java.util.List;
import java.util.ArrayList;

public class Q8 {

}

class ExamAnswers {
	private static ExamAnswers instance = new ExamAnswers();
	private List<String> answers = new ArrayList<>();

	public static List<String> getAnswers() {
		return instance.answers;
	}
}

class TestAnswers {
	private static TestAnswers instance = new TestAnswers();
	private List<String> answers = new ArrayList<>();

	public static TestAnswers getTestAnswers() {
		return instance;
	}

	public List<String> getAnswers() {
		return answers;
	}
}

// Which of these classes properly implement(s) the singleton pattern?
// D Neither class