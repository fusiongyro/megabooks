package org.storytotell.megabooks.ejb;

import org.storytotell.megabooks.entity.Book;
import org.storytotell.megabooks.entity.Borrower;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * A simple DAO for accessing books.
 */
@Named
@Stateless
public class BookDao {
    public BookDao() {}

    @PersistenceContext
    private EntityManager em;

    public Book getFirstBook() {
        return em.find(Book.class, "2");
    }

    /**
     * Get all of the books in the database. Expensive!
     * @return a list of every book
     */
    public List<Book> getAllBooks() {
        return em.createQuery("SELECT b FROM Book b ORDER BY b.id", Book.class).getResultList();
    }

    /**
     * Return a book based on the supplied locator. The locator may be an ID, an ISBN or a book alias.
     * @param locator  Any reasonable book identifier.
     * @return  The located book
     */
    public Book findBook(String locator) {
        return em.find(Book.class, locator);
    }

    /**
     * Return a random book title. Fun for the search box.
     */
    public String getRandomBookTitle() {
        return ((Book)em
                .createNativeQuery("SELECT * FROM books ORDER BY RANDOM() LIMIT 1", Book.class)
                .getSingleResult())
               .getTitle();
    }
}
