package pl.coderslab.book;

import java.util.List;

public interface BookService {

    void save(Book book);

    void update(Book book);

    Book find(Long id);

    Book findWithAuthors(Long id);

    void delete(Long id);

    List<Book> findAll();

    List<Book> findPropositions();

    List<Book> getRatingList(int rating);
    List<Book> findByTitle(String title);
    List<Book> findByCategoryName(String categoryName);
    List<Book> findByCategoryId(Long categoryId);
    List<Book> findByAuthorsFirstAndLastName(String firstName, String lastName);
    List<Book> findByPublisherName(String publisherName);
    List<Book> findByRating(int rating);
    Book findBookByCategoryNameTitle(String categoryName);

}
