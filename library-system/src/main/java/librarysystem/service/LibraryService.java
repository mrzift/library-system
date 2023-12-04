package librarysystem.service;

import librarysystem.model.Books;

import java.util.List;

public interface LibraryService {
    List<Books> getAllBooks();
    void addData(Books books);
    Books getDataById(long id);
}
