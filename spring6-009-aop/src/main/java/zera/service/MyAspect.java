package zera.service;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* zera.service.OrderService.*(..))")
    public void advice(JoinPoint joinPoint) throws Exception{
        System.out.println("前置通知：这是增强的通知" );
        Signature signature = joinPoint.getSignature();
        System.out.println("前置里面的  目标方法的一切：" + signature);
        System.out.println("前置里面的  目标方法的方法名：" + signature.getName());
    }

    @AfterReturning("execution(* zera.service.OrderService.*(..))")
    public void advice1(){
        System.out.println("后置通知：这是增强的通知");

    }

    @Around("execution(* zera.service.OrderService.*(..))")
    public void advice2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("前环绕通知：这是增强的通知");
        proceedingJoinPoint.proceed();
        System.out.println("后环绕通知：这是增强的通知");

    }
}
