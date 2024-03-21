package zera.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringTest01 {
    @Test
    public void testFirstSpring(){

        Logger logger = LoggerFactory.getLogger(SpringTest01.class);
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Date dateBean = applicationContext.getBean("dateBean", Date.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime = sdf.format(dateBean);
        System.out.println(nowTime);
        System.out.println(dateBean.getTime());

    }
}
