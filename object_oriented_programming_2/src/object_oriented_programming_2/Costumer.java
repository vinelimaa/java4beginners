package object_oriented_programming_2;

public class Costumer {

	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// creating
	public Costumer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("name: [%s] \nhomeAddress: [%s] \nworkAddress: [%s]", name, homeAddress, workAddress);
	}
}
