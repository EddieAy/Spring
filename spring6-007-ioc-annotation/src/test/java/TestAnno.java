import com.config.Spring6Config;
import com.service.PersonService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.bean.Vip;
import zera.jdbc.MyDataSource;
import zera.service.OrderService;

public class TestAnno {

    @Test
    public void testAnno(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Vip vip = classPathXmlApplicationContext.getBean("vip", Vip.class);
        System.out.println(vip);
    }

    @Test
    public void testChoose(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
    }

    @Test
    public void testValueAnno(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        MyDataSource myDataSource = classPathXmlApplicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testAutoQualifier(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        OrderService orderService = classPathXmlApplicationContext.getBean("orderService", OrderService.class);
        orderService.save();
    }

    @Test
    public void testResource(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        PersonService personService = classPathXmlApplicationContext.getBean("personService", PersonService.class);
        personService.showInfo();
    }

    @Test
    public void testConfig(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        PersonService personService = annotationConfigApplicationContext.getBean("personService", PersonService.class);
        personService.showInfo();
    }
}
