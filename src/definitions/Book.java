/*  Created by IntelliJ IDEA.
 *  User: Mohit Singh (191500459) | 60
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ISBNNumber='" + ISBNNumber + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(ISBNNumber, book.ISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, ISBNNumber);
    }

}
