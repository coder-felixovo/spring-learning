package pers.felix.aopdemo.advicetype;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/* 通知类 */
@Component //将这个类定义成 Bean
@Aspect //将这个Bean定义为切面
public class MyAdvice {
    //指定UserDao类中的save方法为切入点
    @Pointcut("execution(void pers.felix.aopdemo.advicetype.dao.UserDao.save())")
    private void pt1(){}
    //指定UserDao类中的update方法为切入点
    @Pointcut("execution(int pers.felix.aopdemo.advicetype.dao.UserDao.update())")
    private void pt2(){}

    // 前置通知
    @Before("pt1()")
    public void before() {
        System.out.println("before advice...");
    }

    // 后置通知
    @After("pt1()")
    public void after() {
        System.out.println("after advice...");
    }

    // 返回后通知
    @AfterReturning("pt1()")
    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

    // 异常后通知
    @AfterThrowing("pt1()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }

    /*
    * 环绕通知需要携带ProceedingJoinPoint类型的参数
    * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法
    * 环绕通知必须要有返回值，即为目标方法的返回值
    * */
    @Around("pt2()")
    public Object around(ProceedingJoinPoint pjp) {
        Object result = null;
        try {
            System.out.println("Around advice: Before advice");
            result = pjp.proceed();
            System.out.println("Around advice: AfterReturning advice");
        } catch (Throwable e) {
            System.out.println("Around advice: AfterThrowing advice");
        }
        System.out.println("Around advice: After advice");
        return result;
    }
}
