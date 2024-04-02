package pers.felix.spring5.injectproperty;

/**
 * @author felixovo
 * @date 2023-06-07 11:18:43
 * @description
 */
public class Book {
    private String name;
    private String author;
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
