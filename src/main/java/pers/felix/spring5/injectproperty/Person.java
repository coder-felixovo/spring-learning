package pers.felix.spring5.injectproperty;

/**
 * @author felixovo
 * @date 2023-06-07 21:58:19
 * @description
 */
public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
