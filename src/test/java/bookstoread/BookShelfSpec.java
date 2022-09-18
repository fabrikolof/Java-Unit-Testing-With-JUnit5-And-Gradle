package bookstoread;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookShelfSpec {
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception {
        //Arrange
        BookShelf shelf = new BookShelf();
        //Act
        List<String> books = shelf.books();
        //Assert
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }
}
