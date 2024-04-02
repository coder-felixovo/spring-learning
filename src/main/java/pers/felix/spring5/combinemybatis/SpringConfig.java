package pers.felix.spring5.combinemybatis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/* Spring核心配置类 */
// 配置类注解
@Configuration
// 开启注解扫描
@ComponentScan("pers.felix.spring5.combinemybatis")
// 引入数据源配置类和Mybatis配置类
@Import({DataSourceConfig.class, MybatisConfig.class})
public class SpringConfig {
}
