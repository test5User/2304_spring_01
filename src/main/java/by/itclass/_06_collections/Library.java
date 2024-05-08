package by.itclass._06_collections;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.StringJoiner;

public class Library {
    private int id;
    private List<Book> books;

    public Library(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Library.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("books=" + books)
                .toString();
    }
}
