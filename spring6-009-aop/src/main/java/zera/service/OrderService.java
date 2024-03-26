package zera.service;


import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public void generate(){
        System.out.println("订单正在生成");
        System.out.println("只是单纯的两行");
    }
}
