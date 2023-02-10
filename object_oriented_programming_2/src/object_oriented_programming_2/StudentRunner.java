package object_oriented_programming_2;

public class StudentRunner {

	public static void main(String[] args) {

//		Student student = new Student();
//		student.setName("Vini");
//		student.setEmail("teste.teste@hotmail.com");
//
//		Person person = new Person();
//		person.setName("Vini");
//		person.setEmail("teste.teste@hotmail.com");
//		person.setPhoneNumber("5541999999999");
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("Vini", "Programmer");
//		employee.setName("Vini");
		employee.setEmail("teste.teste@hotmail.com");
		employee.setPhoneNumber("5541999999999");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}

}
