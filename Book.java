package lab3;
class book {
	String title;
	String author;
	double price;
	book() {
		this.title ="unknown";
		this.author ="unknown";
		this.price =0.0;
	}

	void displayBook() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
		System.out.println("-----------------------------");
	}
}
public class Book{
	public static void main(String[] args) {
	book books = new book();
	System.out.println("\nBook Details:");
	books.displayBook();
	}
}
