package zera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import zera.dao.OrderDao;

@Component
public class OrderService {

    @Autowired
    @Qualifier("orderDaoMysql")
    private OrderDao orderDao;

    public void save(){
        orderDao.insert();
    }
}
