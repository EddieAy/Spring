package zera.beans;

import java.util.Date;

public class Person {
    private String name;
    private Date birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
