/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
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

    public static void issueBook(String book) {
        booksIssued.add(book);
        totalBooksIssued++;
    }

    public static ArrayList<String> booksIssued() {
        return booksIssued;
    }

    public static void returnBook(String bookName) {
        if (booksIssued().contains(bookName)) {
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
