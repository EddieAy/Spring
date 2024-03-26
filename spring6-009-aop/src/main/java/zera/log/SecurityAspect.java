package zera.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
@Aspect
public class SecurityAspect {

    @Pointcut("execution(* zera.log..insert*(..))")
    public void insertPointCut(){}

    @Pointcut("execution(* zera.log..delete*(..))")
    public void deletePointCut(){}

    @Pointcut("execution(* zera.log..update*(..))")
    public void updatePointCut(){}

    @Before("insertPointCut() || deletePointCut() || updatePointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = simpleDateFormat.format(new Date());
        System.out.println("XXX 在 " + nowTime + " 正在操作 --> " + joinPoint.getSignature().getName() + "方法");
    }
}
