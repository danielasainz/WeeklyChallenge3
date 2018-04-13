package com.Sainz;

/*
You are going to create an application for a library.
        It will be a console application, with the following menu items:


        - List books

        - Add a book

        - Borrow a book


        Listing books:

        Show a list of all books, and indicate whether they have been borrowed or not.

        Adding books:

        To add a book, you must enter the following information about it:

        Title

        Author

        Year of Publication

        ISBN Number


        Borrowing books

        Show a list of available books (books that have not been borrowed yet), and allow a user to borrow the book.
        */

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
            //where does showMenu come in below
            showMenu();
            System.out.println("Enter a menu number");

            switch (Integer.valueOf(keyboard.nextLine())) {
                case 1:

                  /*

                     newEvent = new Event();
            System.out.println("Enter the event number: ");
            newEvent.setEventNumber(keyboard.nextInt());
            eventAnswer = keyboard.nextLine();

            System.out.println("Enter the event name: ");
            newEvent.setEventName(keyboard.nextLine());

            System.out.println("Enter the event start date: ");
            newEvent.setStartDate(keyboard.nextLine());

            System.out.println("Enter the event end date: ");
            newEvent.setEndDate(keyboard.nextLine());


            System.out.println("Your event information: ");
            System.out.println("Event number: " + newEvent.getEventNumber() + '\n' + "Event name: " + newEvent.getEventName()
                    + '\n' + "Event start date: " + newEvent.getStartDate() + '\n' + "Event end date: " + newEvent.getEndDate());


                   */
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

                        System.out.println("Your book information: ");
                        System.out.println("Book title: " + newBook.getBookTitle() + '\n' + "Book author: " + newBook.getBookAuthor()
                                + '\n' + "Book publication year: " + newBook.getPublicationYear() + '\n' + "Book ISBN number: " + newBook.getIsbnNumber());

                        books.add(newBook);
                        System.out.println('\n' + "Add another book?");
                        bookAnswer = keyboard.nextLine();
                        if (bookAnswer.equalsIgnoreCase("no") || bookAnswer.equalsIgnoreCase("n"))
                            addanother = false;
                    } while (addanother);
                    break;

                case 4:
                    System.out.println("Show everything");
                    System.out.println("------------");
                    System.out.println("*** Books ***");
                    for (Book bk : books
                            ) {
                        System.out.println('\n' + "Book title: " + bk.getBookTitle() + '\n' + "Book author: " + bk.getBookAuthor() + '\n' + "Publication year: " + bk.getPublicationYear() + '\n' + "ISBN Number: " + bk.getIsbnNumber());
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
        System.out.println("4. Show books in the library");
    }
    }

            /*
        }
            public static void showMenu() {
                System.out.println("1. Add a book");
                System.out.println("4. Show everything");
            }
            public static void showBooks(ArrayList<Book> books){
            for (Book book : books
                    ){
                System.out.println(book.getBookTitle());
            }
        }
    }
}
*/