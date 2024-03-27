import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zera.service.AccountService;
import zera.service.impl.AccountServiceImpl;

public class TestTransfer {

    @Test
    public void testTransfer(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        AccountService accountService = classPathXmlApplicationContext.getBean("accountService", AccountService.class);

        try {
            accountService.transfer("act1","act2",10000);
            System.out.println("转账成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("转账失败");
        }


    }
}
