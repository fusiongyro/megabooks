package org.storytotell.megabooks.ejb;

import org.storytotell.megabooks.entity.Book;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by fusion on 5/7/14.
 */
@Stateless
@Named
public class BookDao {
    public BookDao() {
    }

    @PersistenceContext(unitName="default")
    private EntityManager em;

    public Book getFirstBook() {
        return em.find(Book.class, "1");
    }
}
