/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbook;

/**
 *
 * @author jacob
 */
public class TestBook {

    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("Clockers", "R Price", "978-0395537619", 22.89, 10);
        Book book2 = new Book("Fan", "D Rhodes", "978-1909807808", 9.92, 5);

        // Display Program Title
        System.out.println("\nBOOK CLASS EXAMPLE");

        // Display state
        System.out.println("\nBook 1 Title and Price: " + book1.getTitle() + " " +
                           book1.getPrice());
        System.out.println("Book 2 Title and Quantity: " + book2.getTitle() + " " +
                           book2.getQuantity());

        // Change price for book 1
        book1.setPrice(23);
        System.out.println("\nChanging price of Book 1");
        System.out.println("Book 1 Title and Price: " + book1.getTitle() + " " +
                           book1.getPrice());

        // Change quantity for book 2
        book2.setQuantity(2);
        System.out.println("\nChanging quantity of Book 2");
        System.out.println("Book 2 Title and Quantity: " + book2.getTitle() + " " +
                           book2.getQuantity());
    } // end of the main method
} // end of the class

class Book {
    // Fields
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int quantity;

    // Constructor
    public Book(String title, String author, String isbn, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
    }

    // Read accessors
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return isbn; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Set accessors
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}