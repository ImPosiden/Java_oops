package lab3;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    Book() {
        this.title = "unknown";
        this.author = "unknown";
        this.price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title.isEmpty() ? "unknown" : title;
        this.author = author.isEmpty() ? "unknown" : author; 
        this.price = (price == 0) ? 0.0 : price; 
    }
    void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("-----------------------------");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            books[i] = new Book(title, author, price);
        }
        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            books[i].displayBook();
        }
        sc.close();
    }
}
