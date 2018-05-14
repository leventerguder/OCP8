package ch15;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX33 {

	public static void main(String[] args) {
		Stream<Ballot> ballots = Stream.of(new Ballot("Mario", 1, 10), new Ballot("Christina", 1, 8),
				new Ballot("Mario", 2, 9), new Ballot("Christina", 2, 8));

		Map<String, Integer> scores = ballots
				.collect(Collectors.groupingBy(Ballot::getName, Collectors.summingInt(Ballot::getScore))); // w1
		System.out.println(scores.get("Mario"));
	}
}

class Ballot {

	private String name;
	private int judgeNumber;
	private int score;

	public Ballot(String name, int judgeNumber, int score) {
		this.name = name;
		this.judgeNumber = judgeNumber;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJudgeNumber() {
		return judgeNumber;
	}

	public void setJudgeNumber(int judgeNumber) {
		this.judgeNumber = judgeNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}