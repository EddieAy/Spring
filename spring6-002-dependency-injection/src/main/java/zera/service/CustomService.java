package zera.service;

import zera.dao.UserDao;
import zera.dao.VipDao;

public class CustomService {
    private VipDao vipDao;
    private UserDao userDao;

//    public CustomService() {
//    }
//
//    public CustomService(VipDao vipDao, UserDao userDao) {
//        this.vipDao = vipDao;
//        this.userDao = userDao;
//    }


    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        vipDao.save();
        userDao.save();
    }
}
