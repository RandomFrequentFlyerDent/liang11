package mainexercise2;

public class TestLauncher {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Student();
		Person person3 = new Employee();
		Person person4 = new Person();

		person1.setName("Wiebe");
		person2.setName("Nathalie");
		person3.setName("Not-Us");
		person4.setName("Something Else");

		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println(person4.toString());

	}

}
