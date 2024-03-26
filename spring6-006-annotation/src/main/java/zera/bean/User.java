package zera.bean;


import zera.MyComponent;

@MyComponent("userBean")
public class User {
    @MyComponent(value = "username")
    private String name;
}
