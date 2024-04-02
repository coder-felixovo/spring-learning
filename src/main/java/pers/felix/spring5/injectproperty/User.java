package pers.felix.spring5.injectproperty;

import pers.felix.spring5.injectproperty.Book;

import java.util.List;

/**
 * @author felixovo
 * @date 2023-06-07 10:51:45
 * @description
 */
public class User {
    private List<Book> bookList;
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    @Override
    public String toString() {
        return "User{" +
                "bookList=" + bookList +
                '}';
    }
}
