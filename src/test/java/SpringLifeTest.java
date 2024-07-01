import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.felix.springlife.Dog;

public class SpringLifeTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springLife.xml");

        context.getBean(Dog.class);
        System.out.println("使用");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
