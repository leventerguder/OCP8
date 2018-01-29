package mock;

import java.util.HashSet;

class Student {
	public Student(int r) {
		rollNo = r;
	}

	int rollNo;
}

public class QX31 {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>();
		students.add(new Student(5));
		students.add(new Student(10));
		System.out.println(students.contains(new Student(10)));
	}
}
