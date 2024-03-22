package zera.beans;

import org.springframework.beans.factory.FactoryBean;

public class PersonBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

