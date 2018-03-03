package mainexercise2;

public class TestLauncher {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Student();
		Person person3 = new Employee();

		person1.setName("Wiebe");
		person2.setName("Nathalie");
		person3.setName("Not-Us");

		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());

	}

}
