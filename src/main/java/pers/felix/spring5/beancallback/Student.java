package pers.felix.spring5.beancallback;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() throws Exception {
        System.out.println("这是Bean的初始化回调方法 --- 通过xml设置");
    }

    public void destroy() throws Exception {
        System.out.println("这是Bean的销毁回调方法 --- 通过xml设置");
    }
}
