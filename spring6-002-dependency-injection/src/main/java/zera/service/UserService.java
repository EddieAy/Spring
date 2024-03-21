package zera.service;

import zera.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.save();
    }
}
