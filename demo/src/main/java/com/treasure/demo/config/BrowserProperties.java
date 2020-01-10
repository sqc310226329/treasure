/**
 * 文件名：BrowserProperties.java
 * 版权： Copyright 2002-2017 QLYS. All Rights Reserved.
 * 描述：
 * 修改人：时前程
 * 修改时间：2019年11月20日
 * 修改内容：新增
 **/
package com.treasure.demo.config;

/**
 *
 * <p> 
 *      简述一下～
 * <p>
 * @author 时前程 2019年11月20日
 * @see
 * @since 1.0
 */
public class BrowserProperties {

    private String loginPage="/imooc-signIn.html";

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
