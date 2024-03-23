package zera.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class UserTen implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("2.属性赋值"+name);
    }

    public UserTen() {
        System.out.println("1.实例化");
    }

    @Override
    public String toString() {
        return "8. 执行bean UserTen{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3.bean名字"+name);
    }

    public void initBean(){
        System.out.println("6.自己的init方法执行");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("3.类加载器"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3.bean工厂"+beanFactory);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9.disposable 执行");
    }

    public void destroyBean(){
        System.out.println("10.自己的销毁执行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5.setProperties 执行");
    }


}
