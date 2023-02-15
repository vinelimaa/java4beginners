package concurrency;

public class BiCounter {

	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {
		i++;
		// get i
		// increment
		// set i
	}

	synchronized public void incrementJ() {
		j++;
		// get j
		// increment
		// set j
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}
