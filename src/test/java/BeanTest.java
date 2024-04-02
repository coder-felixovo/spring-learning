import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.felix.spring5.injectproperty.Cat;
import pers.felix.spring5.injectproperty.Brand;
import pers.felix.spring5.injectproperty.Dog;
import pers.felix.spring5.injectproperty.Person;
import pers.felix.spring5.injectproperty.Book;
import pers.felix.spring5.injectproperty.UserService;
import pers.felix.spring5.injectproperty.Emp;
import pers.felix.spring5.injectproperty.Student;
import pers.felix.spring5.injectproperty.User;
import pers.felix.spring5.injectproperty.Account;
import pers.felix.spring5.injectproperty.Course;

/**
 * @author felixovo
 * @date 2023-06-07 10:54:24
 * @description
 */
public class BeanTest {
    @Test
    public void test1() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建对象
        Cat cat = context.getBean("cat", Cat.class);
        cat.cry();
    }

    @Test
    public void test2() {
        // 测试set方法属性注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }

    @Test
    public void test3() {
        // 测试有参构造函数属性注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test4() {
        // 测试p名称空间注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test5() {
        // 测试注入null值
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book1", Book.class);
        System.out.println(book);
    }

    @Test
    public void test6() {
        // 测试注入的值含有特殊符号
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book2", Book.class);
        System.out.println(book);
    }

    @Test
    public void test7() {
        // 测试注入外部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test8() {
        // 测试注入内部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test9() {
        // 测试级联赋值1
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test10() {
        // 测试级联赋值2
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp2", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test11() {
        // 测试注入集合属性
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test12() {
        // 在集合设置对象类型值
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }

    @Test
    public void test13() {
        // 测试提取List注入部分
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Account account = context.getBean("account", Account.class);
        System.out.println(account);
    }

    @Test
    public void test14() {
        // 测试工厂bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test15() {
        // 测试Spring创建对象默认情况下是单例
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Brand brand1 = context.getBean("brand", Brand.class);
        Brand brand2 = context.getBean("brand", Brand.class);
        System.out.println(brand1);
        System.out.println(brand2);
    }

    @Test
    public void test16() {
        // 测试设置Spring创建对象为多实例
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Brand brand3 = context.getBean("brand1", Brand.class);
        Brand brand4 = context.getBean("brand1", Brand.class);
        System.out.println(brand3);
        System.out.println(brand4);
    }
}
