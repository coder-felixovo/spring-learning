package pers.felix.spring5.pureanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 设置当前类为Spring配置类
@ComponentScan("pers.felix.spring5.pureanno") // 注解扫描
@Import({DataSourceConfig.class})
public class SpringConfig {
}
