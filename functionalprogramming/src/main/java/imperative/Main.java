package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = List.of(
				new Student("Ram", MALE),
				new Student("Priya", FEMALE),
				new Student("Aisha", FEMALE),
				new Student("Anand", MALE),
				new Student("Kamal", MALE),
				new Student("Kavitha", FEMALE)
		);
		
		// We want to create a list of female students
		
		// Imperative Approach
		System.out.println("Imperative Approach");
		
		List<Student> females = new ArrayList<Main.Student>();
		
		for (Student student : students) {
			if (FEMALE.equals(student.gender)) {
				females.add(student);
			}
		}
		
		for (Student female : females) {
			System.out.println(female);
		}
		
		
		// Declarative Approach
		System.out.println("Declarative Approach");
		
		Predicate<Student> studentPredicate = student -> FEMALE.equals(student.gender);
		
		List<Student> females2 = students.stream()
				.filter(studentPredicate)
				.collect(Collectors.toList());
		
//		females2.forEach(student -> System.out.println(student));
		females2.forEach(System.out::println);
		
		System.out.println("Very short declarative approach");
		
		students.stream()
			.filter(student -> FEMALE.equals(student.gender))
//			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
	
	static class Student {
		private final String name;
		private final Gender gender;
		
		public Student(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", gender=" + gender + "]";
		}
		
	}
	
	enum Gender {
		MALE, FEMALE
	}

}
