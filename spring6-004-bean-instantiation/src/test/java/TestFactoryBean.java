import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.beans.Person;
import zera.beans.PersonBean;

public class TestFactoryBean {
    @Test
    public void testtestFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-instantiation.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
        Person person1 = applicationContext.getBean("personBean", Person.class);
        System.out.println(person1);
    }
}
