package loops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// for limit = 30, output would be 1 4 9 16 25
	public void printSquareUpToLimit() {
		int i = 1;
		while (i * i <= limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	// for limit = 30, output would be 1 8 27
	public void printCubesUpToLimit() {
		int i = 1;
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
