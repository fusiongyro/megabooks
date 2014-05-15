package org.storytotell.megabooks.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by fusion on 5/7/14.
 */
public class BorrowerPK implements Serializable {
    private String bookId;
    private Timestamp borrowedOn;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Timestamp getBorrowedOn() {
        return borrowedOn;
    }

    public void setBorrowedOn(Timestamp borrowedOn) {
        this.borrowedOn = borrowedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BorrowerPK that = (BorrowerPK) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (borrowedOn != null ? !borrowedOn.equals(that.borrowedOn) : that.borrowedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (borrowedOn != null ? borrowedOn.hashCode() : 0);
        return result;
    }
}
