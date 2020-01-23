package com.treasure.oauth2.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * 简述一下～
 * <p>
 *
 * @author 时前程 2020年01月23日
 * @see
 * @si;//ce 1.0
 */
@Data
@TableName("sec_user")
public class SecUser {
  private Long id;
  private String username;
  private String password;
  private String nickname ;
  private String phone;
  private String email;
  private Long birthday ;
  private String sex;
  private String status;
  private String createTime;
  private String updateTime;
}
