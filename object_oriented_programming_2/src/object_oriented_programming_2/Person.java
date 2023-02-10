package object_oriented_programming_2;

public class Person extends Object {

	private String name;
	private String email;
	private String phoneNumber;


	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("nome: %s email: %s phoneNumber: %s", name, email, phoneNumber);
	}

}
