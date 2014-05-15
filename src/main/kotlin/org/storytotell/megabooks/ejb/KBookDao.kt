package org.storytotell.megabooks.ejb

import org.storytotell.megabooks.entity.Book;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * A simple DAO for accessing books.
 */
Stateless
Named("kBookDao")
public open class KBookDao() : KIBookDao {

    PersistenceContext
    private var em: EntityManager? = null

    public fun sayGreeting() : String {
        return "Hello, world!"
    }

    public override var firstBook : Book?
        get() = em!!.find(javaClass<Book>(), "6")
        set(v) { }

    /**
     * Return a book based on the supplied locator. The locator may be an ID, an ISBN or a book alias.
     * @param locator  Any reasonable book identifier.
     * @return  The located book
     */
    public fun findBook(locator: String): Book? {
        return em!!.find(javaClass<Book>(), locator)
    }

    /**
     * Return a random book title. Fun for the search box.
     */
    public override val randomBookTitle : String?
        get() =  ((em!!.createNativeQuery("SELECT * FROM books ORDER BY RANDOM() LIMIT 1", javaClass<Book>())!!.getSingleResult() as Book)).title
}
