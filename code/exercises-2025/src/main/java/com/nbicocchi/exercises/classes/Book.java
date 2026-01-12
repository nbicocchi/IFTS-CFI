package com.nbicocchi.exercises.classes;

/**
 * ### Exercise: Define a Simple Java Class
 *
 * **Title**: Create a `Book` Class
 *
 * **Objective**: Practice defining classes, attributes, constructors, methods, and object creation in Java.
 *
 * ---
 *
 * #### Instructions:
 *
 * 1. **Define a class named `Book`** that represents a book in a library.
 *
 * 2. **Add the following attributes** to the `Book` class:
 *    - `title` (a `String`): the title of the book.
 *    - `author` (a `String`): the author of the book.
 *    - `pages` (an `int`): the number of pages in the book.
 *    - `available` (a `boolean`): whether the book is currently available for borrowing.
 *
 * 3. **Create the following constructors**:
 *    - A default constructor that sets default values for the attributes.
 *    - A parameterized constructor that initializes all attributes.
 *
 * 4. **Add the following methods**:
 *    - `borrowBook()`: Marks the book as unavailable if it is currently available, and prints a message like "You borrowed [title]." If it's already borrowed, print "Sorry, [title] is not available."
 *    - `returnBook()`: Marks the book as available and prints a message like "[title] has been returned."
 *    - `toString()`: Prints the details of the book (title, author, pages, and availability).
 *
 * 5. **Write a `main` method** to:
 *    - Create at least two `Book` objects using different constructors.
 *    - Display their details using the `toString` method.
 *    - Borrow and return a book using the `borrowBook` and `returnBook` methods.
 *
 * ---
 *
 * #### Expected Output Example:
 *
 * ```plaintext
 * Title: The Great Gatsby
 * Author: F. Scott Fitzgerald
 * Pages: 218
 * Available: true
 *
 * You borrowed The Great Gatsby.
 * Sorry, The Great Gatsby is not available.
 *
 * Title: 1984
 * Author: George Orwell
 * Pages: 328
 * Available: true
 *
 * 1984 has been returned.
 * ```
 *
 * ---
 *
 * This exercise helps students understand how to define a class, manage its state using methods, and work with objects in Java.
 */
public class Book {
    String title;
    String author;
    int pages;
    boolean available;

    public Book() {
        this.title = "The Bible";
        this.author = "God";
        this.pages = 1000;
        this.available = true;
    }

    public Book(String title, String author, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            System.out.println("You borrowed " + title);
            available = false;
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            System.out.println("You returned " + title);
            available = false;
        } else {
            System.out.println("Sorry, " + title + " is already available.");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", available=" + available +
                '}';
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Trainspotting", "Boyle", 200, true);
        System.out.println(b1);
        System.out.println(b2);
        b1.borrowBook();
        System.out.println(b1);
        b1.returnBook();
    }
}
