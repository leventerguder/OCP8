package mock;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

public class QX43 {

	public static void main(String[] args) {
		String[] exams = { "OCAJP 8", "OCPJP 8", "Upgrade to OCPJP 8" };
		//Predicate isOCPExam = exam -> exam.contains("OCP"); //compiler error
		
		Predicate isOCPExam = exam -> ((String) exam).contains("OCP");
		List<String> ocpExams = Arrays.stream(exams)
				// LINE-1
				.filter(exam -> exam.contains("OCP")).collect(Collectors.toList()); // LINE-2
		boolean result = ocpExams.stream().anyMatch(exam -> exam.contains("OCA")); // LINE-3
		System.out.println(result);

	}
}
