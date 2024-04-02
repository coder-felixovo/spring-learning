package pers.felix.spring5.injectproperty;

/**
 * @author felixovo
 * @date 2023-06-07 16:59:46
 * @description 部门类
 */
public class Dept {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
