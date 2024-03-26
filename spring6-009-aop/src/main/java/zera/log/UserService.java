package zera.log;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void insertUser(){
        System.out.println("新增User");
    }
    public void deleteUser(){
        System.out.println("删除User");
    }
    public void updateUser(){
        System.out.println("更新User");
    }
    public void getUser(){
        System.out.println("获得User");
    }

}
