package pers.felix.spring5.managethirdpackage;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        // 获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beanManageThirdPackage.xml");
        // 获取DruidDataSource对象
        DruidDataSource druidDataSource = context.getBean("druidDataSource", DruidDataSource.class);
        // 获取数据库连接
        DruidPooledConnection connection = druidDataSource.getConnection();
        // 打印数据源信息
        System.out.println(connection);
    }
}
