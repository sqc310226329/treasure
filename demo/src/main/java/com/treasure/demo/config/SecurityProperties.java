/**
 * 文件名：SecurityProperties.java
 * 版权： Copyright 2002-2017 QLYS. All Rights Reserved.
 * 描述：
 * 修改人：时前程
 * 修改时间：2019年11月20日
 * 修改内容：新增
 **/
package com.treasure.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * <p> 
 *      简述一下～
 * <p>
 * @author 时前程 2019年11月20日
 * @see
 * @since 1.0
 */
@ConfigurationProperties(prefix = "imooc.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
