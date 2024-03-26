import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.log.ProductService;
import zera.log.UserService;
import zera.service.OrderService;

public class TestAop {

    @Test
    public void testAop(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        OrderService orderService = classPathXmlApplicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testSecurity(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        ProductService productService = classPathXmlApplicationContext.getBean("productService", ProductService.class);
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);

        productService.insertProduct();
        productService.deleteProduct();
        productService.updateProduct();

        userService.insertUser();
        userService.deleteUser();
        userService.insertUser();
    }
}
