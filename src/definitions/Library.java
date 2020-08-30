/*  Created by IntelliJ IDEA.
 *  User: Mohit Singh (191500459) | 60
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.ArrayList;

public class Library {
    private static final int TOTAL_BOOKS = 4;
    private static Book[] books = new Book[TOTAL_BOOKS];
    private static ArrayList<String> bookNames = new ArrayList<>();

    public static ArrayList<String> books() {
        books[0] = new Book("Fundamentals of Physics", "Robert Resnick", "1915002345696");
        books[1] = new Book("Head first Java", "David Goggins", "4561237894523");
        books[2] = new Book("the busy coder's guide to android development", "Mark Murphy", "6598632145986");
        books[3] = new Book("The Brief History of Time", "Stephen Hawking", "1236532489657");
        for (int i = 0; i < TOTAL_BOOKS; i++) {
            bookNames.add(books[i].getBookName());
        }
        return bookNames;
    }
}