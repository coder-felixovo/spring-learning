package pers.felix.aopdemo.start;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 定义切面@Aspect
@Component
@Aspect
public class MyAdvice {
    // 定义切点@Pointcut
    // 切点方法必须是private、无参、无返回值、无方法体
    @Pointcut(value = "execution(* pers.felix.aopdemo.start.dao.*Dao.*(..))")
    private void pointCut() {}

    // 定义通知，通知注解有一个value属性，其值为通知所要织入的切点，可以是切点表达式，也可以是切点引用（切点对应的方法名称）

    // 使用切入点引用
    @Before("MyAdvice.pointCut()")
    public void beforeAdvice() {
        System.out.println("前置通知");
    }

    // 使用切入点表达式
    @After(value = "execution(* pers.felix.aopdemo.start.dao.*Dao.*(..))")
    public void afterAdvice() {
        System.out.println("后置通知");
    }
}
