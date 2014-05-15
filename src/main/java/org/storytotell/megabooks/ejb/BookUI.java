package org.storytotell.megabooks.ejb;

import org.storytotell.megabooks.entity.Book;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 * Created by fusion on 5/7/14.
 */
@Stateless
@Named
public class BookUI {
    public BookUI() {}

    private @EJB BookDao dao;

    private Book book = null;
    private String locator = null;

    public void loadBook() {
        book = dao.findBook(locator);
    }

    public Book getBook() {
        return book;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }
}
