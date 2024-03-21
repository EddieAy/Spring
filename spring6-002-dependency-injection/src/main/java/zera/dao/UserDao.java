package zera.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {


    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void save() {
        logger.info("User has been saved");
    }
}
