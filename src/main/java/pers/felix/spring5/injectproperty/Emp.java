package pers.felix.spring5.injectproperty;

import pers.felix.spring5.injectproperty.Dept;

/**
 * @author felixovo
 * @date 2023-06-07 17:00:22
 * @description 员工类
 */
public class Emp {
    private String name;
    private String gender;
    private Dept dept;
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public Dept getDept() {
        return dept;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
