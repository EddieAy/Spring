package zera.dao.impl;

import org.springframework.stereotype.Component;
import zera.dao.OrderDao;


@Component
public class OrderDaoMysql implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql数据库插入了信息");
    }
}
