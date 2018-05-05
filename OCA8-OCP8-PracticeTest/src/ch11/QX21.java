package ch11;

import java.util.List;
import java.util.ArrayList;

public class QX21 {

}
// Which of these classes best implement(s) the singleton pattern?
// TestAnswers

class ExamAnswersQX21 {

	private static ExamAnswersQX21 instance = new ExamAnswersQX21();
	private List<String> answers = new ArrayList<>();

	private ExamAnswersQX21() {
	}
	
	// getExamAnswers() is not static, so you can’t retrieve the instance.
	public ExamAnswersQX21 getExamAnswers() {
		return instance;
	}

	public List<String> getAnswers() {
		return answers;
	}
}

class TestAnswersQX21 {
	
	private static TestAnswersQX21 instance = new TestAnswersQX21();
	private List<String> answers = new ArrayList<>();

	private TestAnswersQX21() {
	}

	public static TestAnswersQX21 getTestAnswers() {
		return instance;
	}

	public List<String> getAnswers() {
		return answers;
	}
}