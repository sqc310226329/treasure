package com.treasure.oauth2.vo;

import lombok.Data;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月23日
 * @see
 * @since 1.0
 */
@Data
public class Permission {

  private Long id;//bigint(64) NOT NULL COMMENT '主键',
  private String name;//varchar(50) NOT NULL COMMENT '权限名',
  private String url;//varchar(1000) DEFAULT NULL COMMENT '类型为页面时，代表前端路由地址，类型为按钮时，代表后端接口地址',
  private Integer type;//int(2) NOT NULL COMMENT '权限类型，页面-1，按钮-2',
  private String permission;//varchar(50) DEFAULT NULL COMMENT '权限表达式',
  private String method;//varchar(50) DEFAULT NULL COMMENT '后端接口访问方式',
  private Integer sort;//int(11) NOT NULL COMMENT '排序',
  private String parent_id;//bigint(64) NOT NULL COMMENT '父级id
}
