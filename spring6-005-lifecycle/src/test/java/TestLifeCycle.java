import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.bean.User;
import zera.bean.UserTen;

public class TestLifeCycle {

    @Test
    public void testLifeCycle(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("LifeCycle.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testLifeCycle10(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("LifeCycle10.xml");
        UserTen userTen = applicationContext.getBean("userTen", UserTen.class);
        System.out.println(userTen);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
