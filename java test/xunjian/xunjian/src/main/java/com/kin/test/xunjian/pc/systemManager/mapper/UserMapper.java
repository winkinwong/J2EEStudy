package com.kin.test.xunjian.pc.systemManager.mapper;

import com.kin.test.xunjian.pc.systemManager.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Kin
 * @since 2020-01-16
 */
public interface UserMapper extends BaseMapper<User> {

    User getUserByName(String test);
}
