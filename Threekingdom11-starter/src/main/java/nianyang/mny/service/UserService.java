package nianyang.mny.service;

import nianyang.mny.entity.UserDO;

/**
 * @author sikou
 * @date 2021/01/17
 */
public interface UserService {
    /**
     *
     * @param id
     * @return
     */
    UserDO getUserById(Long id);
}
