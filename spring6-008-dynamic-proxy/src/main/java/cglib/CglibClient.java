package cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibClient {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new TimeMethodInterceptor());

        UserService userServiceProxy = (UserService) enhancer.create();
        System.out.println(userServiceProxy);
        userServiceProxy.login();
        userServiceProxy.logout();
    }
}
