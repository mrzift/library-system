package librarysystem.service;

import librarysystem.model.Books;
import librarysystem.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public void addData(Books books) {
        this.booksRepository.save(books);
    }

    @Override
    public Books getDataById(long id) {
        Optional< Books > optional = booksRepository.findById(id);
        Books books = null;
        if (optional.isPresent()) {
            books = optional.get();
        } else {
            throw new RuntimeException(" Data not found for id :: " + id);
        }
        return books;
    }
}
