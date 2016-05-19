/**
 * MailAuthenticator.java
 * com.xingxunlei.authenticator
 *
 * Function： 邮件服务器认证
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-19 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
 */

package com.xingxunlei.bean;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * ClassName:MailAuthenticator
 * Function: 邮件服务器认证信息
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2016-5-19 上午10:15:32
 * 
 * @see
 */
public class MailAuthenticator extends Authenticator {

    private String username;
    private String password;

    public MailAuthenticator() {

    }

    public MailAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
