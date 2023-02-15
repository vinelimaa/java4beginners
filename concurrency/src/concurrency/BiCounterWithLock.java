package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockforI = new ReentrantLock();
	Lock lockforJ = new ReentrantLock();

	public void incrementI() {
		lockforI.lock();// Get lock for i
		i++;
		lockforI.unlock();// Release lock for i
	}

	public void incrementJ() {
		lockforJ.lock();// Get lock for j
		j++;
		lockforJ.unlock();// Release lock for j
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}
