/*  Created by IntelliJ IDEA.
 *  User: Mohit Singh (191500459) | 60
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;
import java.util.ArrayList;

public class Student {
    private static String studentName;
    private static long universityRollNumber;
    private static int totalBooksIssued = 0;
    private static ArrayList<String> booksIssued = new ArrayList<>();

    public static String getStudentName() {
        return studentName;
    }

    public static void setStudentName(String nameOfStudent) {
        studentName = nameOfStudent;
    }

    public static void setUniversityRollNumber(long rollNumber) {
        universityRollNumber = rollNumber;
    }

    /**
     * This method adds the book issued by the student to the books issued arraylist
     *
     * @param book is the book issued
     */
    public static void issueBook(String book) {
        booksIssued.add(book);
        totalBooksIssued++;
    }

    public static ArrayList<String> getBooksIssued() {
        return booksIssued;
    }

    /**
     * This method removes the book returned from the books issued arraylist
     *
     * @param bookName is the name of the book returned
     */
    public static void returnBook(String bookName) {
        if (getBooksIssued().contains(bookName)) {
            booksIssued.remove(bookName);
            totalBooksIssued--;
            System.out.println(bookName + " returned successfully");
        } else {
            System.out.println("This Book is not issued");
        }
    }

    public static int getTotalBooksIssued() {
        return totalBooksIssued;
    }


}
