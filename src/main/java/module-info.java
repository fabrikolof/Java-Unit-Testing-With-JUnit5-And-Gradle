module com.junit5book.bookstoread {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.junit5book.bookstoread to javafx.fxml;
    exports com.junit5book.bookstoread;
}