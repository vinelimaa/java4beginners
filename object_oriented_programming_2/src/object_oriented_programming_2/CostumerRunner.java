package object_oriented_programming_2;

public class CostumerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line1", "Smallville", "999999");
		Costumer costumer = new Costumer("Clark Kent", homeAddress);

		Address workAddress = new Address("line1 work", "Metropolis", "100000");
		costumer.setWorkAddress(workAddress);

		System.out.println(costumer);

	}

}
