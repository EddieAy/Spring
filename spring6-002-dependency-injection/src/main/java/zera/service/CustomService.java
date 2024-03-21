package zera.service;

import zera.dao.UserDao;
import zera.dao.VipDao;

public class CustomService {
    private VipDao vipDao;
    private UserDao userDao;

    public CustomService(VipDao vipDao, UserDao userDao) {
        this.vipDao = vipDao;
        this.userDao = userDao;
    }

    public void save(){
        vipDao.save();
        userDao.save();
    }
}
