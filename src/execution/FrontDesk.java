/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_BOOK = 1;
    public static final int RETURN_BOOK = 2;
    public static final int BOOKS_ISSUED = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        int entry;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String studentName = scanner.nextLine();
        Student.setStudentName(studentName);
        System.out.println("Enter Your University Roll Number ");
        long universityRollNumber = scanner.nextLong();
        Student.setUniversityRollNumber(universityRollNumber);
        scanner.nextLine();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you " + Student.getStudentName());
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            entry = scanner.nextInt();
            switch (entry) {
                case ISSUE_BOOK:
                    System.out.println("Books Available: ");
                    System.out.println(Library.books());
                    System.out.println("Enter the book to be issued: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    if (Library.books().contains(bookName)) {
                        System.out.println(bookName + " issued successfully.. enjoy reading");
                        Student.issueBook(bookName);
                    } else {
                        System.out.println("This books is not available");
                    }
                    break;
                case RETURN_BOOK:
                    if (Student.getTotalBooksIssued() != 0) {
                        System.out.println("Enter the name of the book to be returned: ");
                        scanner.nextLine();
                        String bookReturned = scanner.nextLine();
                        Student.returnBook(bookReturned);
                    } else {
                        System.out.println("Total Books issued by " + Student.getStudentName() + " are " + Student.getTotalBooksIssued());
                    }
                    break;
                case BOOKS_ISSUED:
                    System.out.println("Total Books issued by " + Student.getStudentName() + " are " + Student.getTotalBooksIssued());
                    if (Student.getTotalBooksIssued() != 0) {
                        System.out.println("The books are: ");
                        for (String books : Student.booksIssued()) {
                            System.out.println(books);
                        }
                    }
                    break;
                default:
                    if (entry != EXIT)
                        System.out.println("Invalid Entry");
            }
        } while (entry != EXIT);
        scanner.close();
    }
}
