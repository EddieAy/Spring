package zera.dao.impl;

import org.springframework.stereotype.Component;
import zera.dao.OrderDao;


@Component("orderDaoOracle")
public class OrderDaoOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库插入了信息");
    }
}
