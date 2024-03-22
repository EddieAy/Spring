package zera;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.bean.MathBean;
import zera.bean.PersonPInjection;
import zera.bean.User;
import zera.bean.YuQian;
import zera.dao.UserDao;
import zera.jdbc.MyDataSource;
import zera.service.CustomService;
import zera.service.UserService;

public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();

    }

    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config2.xml");
        CustomService customServiceBean = applicationContext.getBean("customServiceBean", CustomService.class);
        customServiceBean.save();
    }

    @Test
    public void testBasic(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config2.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config2.xml");
        YuQian yuQian = applicationContext.getBean("yuQian", YuQian.class);
        System.out.println(yuQian);
    }


    @Test
    public void testSymbol(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config2.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }

    @Test
    public void testPInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config2.xml");
        PersonPInjection personPInjection = applicationContext.getBean("personPInjection", PersonPInjection.class);
        System.out.println(personPInjection);
    }

    @Test
    public void testUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testAutoWire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        CustomService customService = applicationContext.getBean("customService", CustomService.class);
        System.out.println(customService);
        customService.save();
    }


}
