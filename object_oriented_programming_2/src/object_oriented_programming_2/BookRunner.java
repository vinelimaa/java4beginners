package object_oriented_programming_2;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(1, "Scrum", "Jeff Sutherland");
		book.addReview(new Review(1, "Awesome", 8));
		book.addReview(new Review(2, "Awesome", 9));

		System.out.println(book);
	}

}
