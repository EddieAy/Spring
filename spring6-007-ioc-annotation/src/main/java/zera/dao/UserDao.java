package zera.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Component
public class UserDao {
    public UserDao() {
        System.out.println("UserDao");
    }
}

//@Controller
class ConClass{
    public ConClass() {
        System.out.println("ConClass");
    }
}

//@Repository
class RepoClass{
    public RepoClass() {
        System.out.println("RepoClass");
    }
}
