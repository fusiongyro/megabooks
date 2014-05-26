package org.storytotell.megabooks.ui;

import org.storytotell.megabooks.ejb.BookDao;
import org.storytotell.megabooks.entity.Book;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by fusion on 5/7/14.
 */
@Named
@RequestScoped
public class BookUI {
    public BookUI() {}

    @Inject
    private BookDao dao;

    private Book book = null;
    private String locator = null;

    public void loadBook() {
        book = dao.findBook(locator);
    }

    @Produces @Current
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
