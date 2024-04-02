package pers.felix.aopdemo.start;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/* Spring核心配置类 */
@Configuration
@ComponentScan("pers.felix.aopdemo.start") // 开启注解扫描
@EnableAspectJAutoProxy // 开启AspectJ自动代理
public class SpringConfig {
}
