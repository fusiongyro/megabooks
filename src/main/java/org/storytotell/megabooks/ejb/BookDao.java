package org.storytotell.megabooks.ejb;

import org.storytotell.megabooks.entity.Book;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * A simple DAO for accessing books.
 */
@Stateless
@Named
public class BookDao {
    public BookDao() {}

    @PersistenceContext
    private EntityManager em;

    public Book getFirstBook() {
        return em.find(Book.class, "2");
    }

    /**
     * Return a book based on the supplied locator. The locator may be an ID, an ISBN or a book alias.
     * @param locator  Any reasonable book identifier.
     * @return  The located book
     */
    public Book findBook(String locator) {
        return em.find(Book.class, locator);
    }
}
