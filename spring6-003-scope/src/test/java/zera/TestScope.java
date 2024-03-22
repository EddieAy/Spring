package zera;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.beans.SpringBean;

public class TestScope {

    @Test
    public void testScope(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        System.out.println(sb2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean a = applicationContext.getBean("sb", SpringBean.class);
                SpringBean b = applicationContext.getBean("sb", SpringBean.class);
                System.out.println(a);
                System.out.println(b);
            }
        }).start();


    }
}
