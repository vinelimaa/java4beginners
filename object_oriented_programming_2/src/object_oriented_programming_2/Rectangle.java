package object_oriented_programming_2;

public class Rectangle {

	// state
	private int width;
	private int height;

	// creation
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// operations
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return height;
	}

	public void setHeigth(int height) {
		this.height = height;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return String.format("width: %d\nheight: %d\narea: %d\nperimeter: %d", width, height, area(), perimeter());
	}
}
