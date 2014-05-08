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
}
