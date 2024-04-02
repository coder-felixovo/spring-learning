package pers.felix.spring5.injectproperty;

import org.springframework.beans.factory.FactoryBean;
import pers.felix.spring5.injectproperty.Course;

/**
 * @author felixovo
 * @date 2023-06-08 09:23:42
 * @description
 */
public class MyBean implements FactoryBean<Course> {
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("数据结构");
        return course;
    }
    public Class<?> getObjectType() {
        return null;
    }
    public boolean isSingleton() {
        return false;
    }
}
