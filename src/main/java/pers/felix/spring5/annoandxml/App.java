package pers.felix.spring5.annoandxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // e.g.1
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnoAndXml.xml");
//        User user = context.getBean(User.class);
//        System.out.println(user);
//        context.close();

        // e.g.2
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAnnoAndXml.xml");
        User user = context.getBean(User.class);
        System.out.println(user);
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save();
    }
}
