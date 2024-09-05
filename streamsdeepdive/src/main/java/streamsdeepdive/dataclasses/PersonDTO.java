package streamsdeepdive.dataclasses;

public class PersonDTO {

	private final int id;
	private final String name;
	private final int age;
	
	public PersonDTO(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static PersonDTO map(Person person) {
		return new PersonDTO(
				person.getId(),
				person.getName(),
				person.getAge()
		);
	}
}
