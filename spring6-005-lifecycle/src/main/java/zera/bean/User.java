package zera.bean;

public class User {
    private String name;

    public User() {
        System.out.println("1.创造对象");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.给属性赋值");
    }

    public void initBean(){
        System.out.println("3.初始化Bean");
    }

    public void destroyBean(){
        System.out.println("5.销毁Bean");
    }

    @Override
    public String toString() {
        return "4.使用Bean User{" +
                "name='" + name + '\'' +
                '}';
    }
}
