package zera.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* zera.service.OrderService.*(..))")
    public void advice(){
        System.out.println("应该是增强的通知");
    }
}
