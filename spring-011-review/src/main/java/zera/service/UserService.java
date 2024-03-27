package zera.service;

import zera.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void setDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.insert();
    }
}
