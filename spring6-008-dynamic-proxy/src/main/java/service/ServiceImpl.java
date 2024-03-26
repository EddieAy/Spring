package service;

public class ServiceImpl implements Service{

    @Override
    public void generate() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单已生成");

    }

    @Override
    public void detail() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单信息如下");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("修改订单");
    }
}
