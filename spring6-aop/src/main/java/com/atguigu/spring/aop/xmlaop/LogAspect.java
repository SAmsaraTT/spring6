package com.atguigu.spring.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/29 21:19
 * @Version 1.0
 */

@Component
public class LogAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("Logger-->前置通知，方法名称：" + name + "，参数：" + Arrays.toString(args));
    }


    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();

        System.out.println("Logger-->后置通知，方法名称：" + name);
    }



    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();

        System.out.println("Logger-->返回通知，方法名称：" + name + "，返回结果：" + result);
    }


    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();

        System.out.println("Logger-->异常通知，方法名称：" + name + "，异常信息：" + ex);
    }


    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String string = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("环绕通知==目标方法之前执行");

           result = joinPoint.proceed();

            System.out.println("环绕通知==目标方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知==目标方法出现异常后执行");
        } finally {
            System.out.println("环绕通知==目标方法执行完毕执行");
        }

        return result;
    }


}
