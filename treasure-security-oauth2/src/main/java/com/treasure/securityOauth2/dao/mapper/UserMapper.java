package com.treasure.securityOauth2.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.treasure.securityOauth2.model.SecUser;
import com.treasure.securityOauth2.vo.Permission;

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
public interface UserMapper extends BaseMapper<SecUser> {

    List<Permission> queryPermission(String userName);
}
