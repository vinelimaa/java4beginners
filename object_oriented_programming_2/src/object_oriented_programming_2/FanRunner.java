package object_oriented_programming_2;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Manufacture 1", 0.34567, "Green");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
