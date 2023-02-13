package object_oriented_programming_2_interface;

public class ChessGame implements GammingConsole {

	public static void main(String[] args) {

	}

	@Override
	public void up() {
		System.out.println("Move piece up");

	}

	@Override
	public void down() {
		System.out.println("Move piece down");
	}

	@Override
	public void left() {
		System.out.println("Move piece left");

	}

	@Override
	public void right() {
		System.out.println("Move piece right");

	}

}
