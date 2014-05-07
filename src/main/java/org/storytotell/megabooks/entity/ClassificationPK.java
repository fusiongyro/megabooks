package org.storytotell.megabooks.entity;

import java.io.Serializable;

/**
 * Created by fusion on 5/7/14.
 */
public class ClassificationPK implements Serializable {
    private String isbn;
    private String label;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassificationPK that = (ClassificationPK) o;

        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
