package object_oriented_programming_2_interface;

public class MarioGame implements GammingConsole {

	public static void main(String[] args) {

	}

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");
	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

	@Override
	public void right() {
		System.out.println("Go forward");

	}

}
