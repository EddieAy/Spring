package zera.beans;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;

public class PersonBean implements FactoryBean<Person> {

    private String strDate;

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        person.setBirth(simpleDateFormat.parse(this.strDate));
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

