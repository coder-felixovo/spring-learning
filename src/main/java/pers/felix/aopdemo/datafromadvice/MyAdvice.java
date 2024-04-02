package pers.felix.aopdemo.datafromadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/* 通知类 */
@Component //将这个类定义成 Bean
@Aspect //将这个Bean定义为切面
public class MyAdvice {
    //指定UserService类中的hello方法为切入点
    @Pointcut("execution(* pers.felix.aopdemo.datafromadvice.service.UserService.hello(..))")
    private void pt1(){}

    // 前置通知
//    @Before("pt1()")
    public void before(JoinPoint joinPoint) {
        System.out.println("目标方法名：" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的简单类名：" + joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("目标方法所属类的类名：" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("目标方法声明类型：" + Modifier.toString(joinPoint.getSignature().getModifiers()));

        // 获取传入目标方法的参数数组
        Object[] args = joinPoint.getArgs();
        int len = args.length;
        for (int i = 0; i < len; i++) {
            System.out.println("第" + (i+1) + "个参数为：" + args[i]);
        }

        System.out.println("目标对象：" + joinPoint.getTarget());
        System.out.println("代理对象：" + joinPoint.getThis());

        System.out.println("目标对象：" + joinPoint.getTarget().getClass());
        System.out.println("代理对象：" + joinPoint.getThis().getClass());
    }

    // 环绕通知
    @Around("pt1()")
    public Object around(ProceedingJoinPoint pjp) {
        Object result = null;
        try {
            // 获取传入目标方法的参数
            Object[] args = pjp.getArgs();
            // 前置通知
            System.out.println("目标方法执行前...原参数："+ Arrays.toString(args));
            // 将传入的英文名变成大写
            args[0] = args[0].toString().toUpperCase();
            // 用新的参数args执行目标方法
            result = pjp.proceed(args);
            // 返回通知
            System.out.println("目标方法返回结果后...新参数："+ Arrays.toString(args));
        } catch (Throwable e) {
            //异常通知
            System.out.println("执行目标方法异常后...");
            e.printStackTrace();
        }
        // 后置通知
        System.out.println("目标方法执行后...");
        return result;
    }

}

