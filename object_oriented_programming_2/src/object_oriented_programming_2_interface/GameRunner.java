package object_oriented_programming_2_interface;

public class GameRunner {

	public static void main(String[] args) {

		// MarioGame game = new MarioGame();
		// ChessGame game = new ChessGame();
		GammingConsole game = new MarioGame();

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
