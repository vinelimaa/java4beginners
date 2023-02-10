package object_oriented_programming_2;

public class Fan {

	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5
	
	//creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print state
	@Override
	public String toString() {
		return String.format("make: %s\nradius: %f\ncolor: %s\nisOn: %b\nspeed: %d", make, radius, color, isOn, speed);
	}
}
