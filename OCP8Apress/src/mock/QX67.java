package mock;

import java.util.Comparator;
import java.util.stream.Stream;

class Employee {
	String firstName;
	String lastName;

	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}
}

public class QX67 {

	public static void main(String[] args) {

	     Employee[] employees = { new Employee("Dan", "Abrams"),
	                              new Employee("Steve", "Nash"),
	                              new Employee("John", "Nash"),
	                              new Employee("Dan", "Lennon"),
	                              new Employee("Steve", "Lennon")
	                            };
	    
		Comparator<Employee> sortByFirstName = ((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
		Comparator<Employee> sortByLastName = ((e1, e2) -> e1.getLastName().compareTo(e2.getLastName()));
		
		
		Stream.of(employees) .sorted(sortByFirstName.reversed().thenComparing(sortByLastName)) .forEach(System.out::println);
	}
}
