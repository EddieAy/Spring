package client;

import service.Service;
import service.ServiceImpl;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Service target = new ServiceImpl();
        Service orderServiceProxy = (Service) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new TimeInvokeHandler(target));

        orderServiceProxy.generate();

        orderServiceProxy.detail();

        orderServiceProxy.modify();
    }
}
