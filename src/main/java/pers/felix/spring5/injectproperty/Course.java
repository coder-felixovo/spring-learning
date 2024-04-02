package pers.felix.spring5.injectproperty;

/**
 * @author felixovo
 * @date 2023-06-08 09:24:14
 * @description
 */
public class Course {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
