package com.treasure.oauth2.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.treasure.oauth2.dao.mapper.UserMapper;
import com.treasure.oauth2.model.SecUser;
import com.treasure.oauth2.service.IUserService;
import com.treasure.oauth2.vo.Permission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月23日
 * @see
 * @since 1.0
 */

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, SecUser> implements IUserService {

    private UserMapper userMapper;
    @Override
    public List<Permission> queryPermission(String userName) {
        return userMapper.queryPermission(userName);
    }
}
