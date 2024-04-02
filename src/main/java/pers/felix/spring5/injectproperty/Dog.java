package pers.felix.spring5.injectproperty;

/**
 * @author felixovo
 * @date 2023-06-07 21:53:05
 * @description
 */
public class Dog {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
