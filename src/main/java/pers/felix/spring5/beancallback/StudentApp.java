package pers.felix.spring5.beancallback;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        // 获取容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanCallback.xml");
        // 从容器中获取bean
        Student student = context.getBean("student", Student.class);
        // 使用bean
        System.out.println(student);
        // 关闭容器
        context.close();
    }
}
