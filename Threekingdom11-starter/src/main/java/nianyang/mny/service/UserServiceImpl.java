package nianyang.mny.service;

import nianyang.mny.dao.UserDAO;
import nianyang.mny.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sikou
 * @date 2021/01/17
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDO getUserById(Long id) {
        UserDO userDO= userDAO.selectByPrimaryKey(id);
        return userDO;
    }
}
