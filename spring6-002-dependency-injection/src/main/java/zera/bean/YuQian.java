package zera.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class YuQian {
    private String[] hobbies;
    private List<String> friends;
    private Set<String> subjects;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "YuQian{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", friends=" + friends +
                ", subjects=" + subjects +
                ", properties=" + properties +
                '}';
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

}
