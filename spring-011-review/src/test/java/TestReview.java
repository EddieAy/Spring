import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.dao.MyDataSource;
import zera.service.OrderService;
import zera.service.UserService;

public class TestReview {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("review.xml");
/*        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.save();*/

/*        MyDataSource myDataSource = classPathXmlApplicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);*/

        OrderService orderService = classPathXmlApplicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
