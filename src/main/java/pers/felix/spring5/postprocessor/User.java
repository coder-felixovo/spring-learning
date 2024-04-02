package pers.felix.spring5.postprocessor;

public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("Bean实例化：无参构造方法");
    }

    public void setName(String name) {
        System.out.println("Bean属性注入：setter方法注入属性name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Bean属性注入：setter方法注入属性age");
        this.age = age;
    }

    // 初始化回调方法
    public void init() throws Exception {
        System.out.println("Bean初始化：执行Bean初始化回调方法");
    }

    public void destroy() throws Exception {
        System.out.println("Bean销毁：执行Bean销毁回调方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
