package pers.felix.spring5.injectproperty;

import java.util.*;

/**
 * @author felixovo
 * @date 2023-06-07 17:31:38
 * @description 学生类
 */
public class Student {
    // 数组类型属性
    private String[] courses;
    // List集合类型属性
    private List<String> list;
    // Map集合类型属性
    private Map<String, String> map;
    // Set集合类型属性
    private Set<String> set;
    // Property
    private Properties properties;
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}
