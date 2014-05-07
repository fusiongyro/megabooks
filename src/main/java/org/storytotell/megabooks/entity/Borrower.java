package org.storytotell.megabooks.entity;

import java.sql.Timestamp;

/**
 * Created by fusion on 5/7/14.
 */
public class Borrower {
    private String bookId;
    private String name;
    private String email;
    private String phone;
    private Timestamp borrowedOn;
    private Timestamp returnedOn;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getBorrowedOn() {
        return borrowedOn;
    }

    public void setBorrowedOn(Timestamp borrowedOn) {
        this.borrowedOn = borrowedOn;
    }

    public Timestamp getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(Timestamp returnedOn) {
        this.returnedOn = returnedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Borrower borrower = (Borrower) o;

        if (bookId != null ? !bookId.equals(borrower.bookId) : borrower.bookId != null) return false;
        if (borrowedOn != null ? !borrowedOn.equals(borrower.borrowedOn) : borrower.borrowedOn != null) return false;
        if (email != null ? !email.equals(borrower.email) : borrower.email != null) return false;
        if (name != null ? !name.equals(borrower.name) : borrower.name != null) return false;
        if (phone != null ? !phone.equals(borrower.phone) : borrower.phone != null) return false;
        if (returnedOn != null ? !returnedOn.equals(borrower.returnedOn) : borrower.returnedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (borrowedOn != null ? borrowedOn.hashCode() : 0);
        result = 31 * result + (returnedOn != null ? returnedOn.hashCode() : 0);
        return result;
    }
}
