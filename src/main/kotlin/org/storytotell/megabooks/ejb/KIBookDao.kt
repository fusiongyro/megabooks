package org.storytotell.megabooks.ejb

import javax.ejb.Local
import org.storytotell.megabooks.entity.Book

/**
 * Created by fusion on 5/14/14.
 */
Local
public trait KIBookDao {
    public open var firstBook : Book?
    public open val randomBookTitle : String?
}