package com.Sainz;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        Book newBook;
        String answer;
        String bookAnswer;
        boolean done = false;
        boolean addanother = true;

        do {
            addanother = true;
            showMenu();
            System.out.println("Enter a menu number");

            switch (Integer.valueOf(keyboard.nextLine())) {
                case 1:

                    do {
                        newBook = new Book();
                        System.out.println("Add a book");

                        System.out.println("Enter the book title: ");
                        newBook.setBookTitle(keyboard.nextLine());

                        System.out.println("Enter the book's author: ");
                        newBook.setBookAuthor(keyboard.nextLine());

                        System.out.println("Enter the book's publication year: ");
                        newBook.setPublicationYear(keyboard.nextLine());

                        System.out.println("Enter the book's ISBN number: ");
                        newBook.setIsbnNumber(keyboard.nextLine());

                        System.out.println("Enter if the book is available or not: ");
                        newBook.setBookAvailable(keyboard.nextLine());

                        System.out.println("Your book information: ");
                        System.out.println("Book title: " + newBook.getBookTitle() + '\n' + "Book author: " + newBook.getBookAuthor()
                                + '\n' + "Book publication year: " + newBook.getPublicationYear() + '\n' + "Book ISBN number: " + newBook.getIsbnNumber() +  '\n' + "Is book available: " + newBook.getBookAvailable());


                        books.add(newBook);
                        System.out.println('\n' + "Add another book?");
                        bookAnswer = keyboard.nextLine();
                        if (bookAnswer.equalsIgnoreCase("no") || bookAnswer.equalsIgnoreCase("n"))
                            addanother = false;
                    } while (addanother);
                    break;
                case 2:
                boolean available = true;
                for (Book eachBook:books) {
                    available = eachBook.isInStock();
                    if (available) {
                        eachBook.setInStock(false);
                    }
                }
                System.out.println("Enter the title of the book you would like to borrow");
                keyboard.nextLine();

                       System.out.println("You borrowed the following book:");
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Show everything");
                    System.out.println("------------");
                    System.out.println("*** Books ***");
                    for (Book bk : books
                            ) {
                        System.out.println('\n' + "Book title: " + bk.getBookTitle() + '\n' + "Book author: " + bk.getBookAuthor() + '\n' + "Publication year: " + bk.getPublicationYear() + '\n' + "ISBN Number: " + bk.getIsbnNumber()
                        + '\n' + "Book available: " +bk.getBookAvailable());
                    }
                    break;
            }
            System.out.println('\n' + "Return to main menu?");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }
        } while (done);
    }

    public static void showMenu() {
        System.out.println("Please consider the following menu options:");
        System.out.println("1. Add a book");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Show books in the library");
    }
    }

