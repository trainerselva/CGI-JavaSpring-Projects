package streamsdeepdive.dataclasses;

public class Person {
	
	private final int id;
	private final String name;
	private final int age;
	private final Gender gender;
	private final String email;
	
	public Person(int id, String name, int age, Gender gender, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + "]";
	}
	
	
}
