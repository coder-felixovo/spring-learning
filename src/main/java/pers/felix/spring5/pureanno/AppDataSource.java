package pers.felix.spring5.pureanno;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class AppDataSource {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource druidDataSource = context.getBean("druidDataSource", DruidDataSource.class);
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
    }
}
