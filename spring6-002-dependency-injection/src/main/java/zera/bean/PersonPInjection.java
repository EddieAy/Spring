package zera.bean;

import java.util.Date;

public class PersonPInjection {
    private String name;
    private Date birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "PersonPInjection{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
