package streamsdeepdive.dataclasses;

import java.util.List;

public class GenerateData {

	public static List<Person> getPeople() {
		return List.of(
				new Person(1, "First", 20, Gender.MALE, "first@gmail.com"),
				new Person(2, "Second", 33, Gender.FEMALE, "second@gmail.com"),
				new Person(3, "Third", 57, Gender.FEMALE, "third@gmail.com"),
				new Person(4, "Fourth", 14, Gender.MALE, "fourth@gmail.com"),
				new Person(5, "Fifth", 99, Gender.MALE, "fifth@gmail.com"),
				new Person(6, "Sixth", 7, Gender.FEMALE, "sixth@gmail.com"),
				new Person(7, "Seventh", 120, Gender.FEMALE, "seventh@gmail.com"),
				new Person(8, "Eighth", 6, Gender.MALE, "eighth@gmail.com"),
				new Person(9, "Ninth", 10, Gender.FEMALE, "ninth@gmail.com"),
				new Person(10, "Tenth", 9, Gender.MALE, "tenth@gmail.com"),
				new Person(11, "Different Sixth", 9, Gender.MALE, "sixth@gmail.com"),
				new Person(12, "Seventh", 25, Gender.FEMALE, "newseventh@gmail.com")
		);
	}
	
	public static List<Car> getCars() {
		return List.of(
				new Car(1, "Maruti", "Celerio", 700000, 2023, "Blue"),
				new Car(2, "Mahindra", "XUV700", 1800000, 2021, "White"),
				new Car(3, "Ford", "Figo", 2100000, 2022, "Yellow"),
				new Car(4, "Ford", "Endeavor", 3000000, 2022, "Blue"),
				new Car(5, "Tata", "Harrier", 2200000, 2024, "Black"),
				new Car(6, "Tata", "Nexon", 900000, 2023, "Yellow"),
				new Car(7, "Honda", "Civic", 2500000, 2023, "Black"),
				new Car(8, "Honda", "BRV", 1600000, 2022, "White"),
				new Car(9, "Toyota", "Corolla", 3500000, 2022, "Black"),
				new Car(10, "Toyota", "Camry", 3200000, 2021, "Pink"),
				new Car(11, "Mercedes Benz", "C class", 4500000, 2023, "Blue"),
				new Car(12, "Honda", "City", 2500000, 2020, "Silver")
		);
	}

}
