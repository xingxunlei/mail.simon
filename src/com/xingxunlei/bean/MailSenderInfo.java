/**
 * MailSenderInfo.java
 * com.xingxunlei.bean
 *
 * Function： 邮件发送服务器的相关信息
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-19 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
 */

package com.xingxunlei.bean;

import com.xingxunlei.util.PropertiesUtil;
import java.util.Properties;

/**
 * ClassName:MailSenderInfo
 * Function: 邮件发送服务器的相关信息
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2016-5-19 上午10:13:16
 * 
 * @see
 */
public class MailSenderInfo {

    // 发送邮件的服务器的IP
    private String mailServerHost;
    // 发送邮件的服务器的端口
    private String mailServerPort = "25";
    // 邮件发送者的昵称
    private String fromNick;
    // 邮件发送者的地址
    private String fromAddress;
    // 邮件接收者的地址
    private String[] toAddress;
    // 邮件密送接收者的地址
    private String[] toBlindCarbonCopyAddress;
    // 邮件抄送接收者的地址
    private String[] toCarbonCopyAddress;
    // 登陆邮件发送服务器的用户名
    private String userName;
    // 登陆邮件发送服务器的密码
    private String password;
    // 是否需要身份验证
    private String validate;
    // 邮件主题
    private String subject;
    // 邮件的文本内容
    private String content;
    // 邮件附件的文件名
    private String[] attachFileNames;

    /**
     * 获得邮件会话属性
     */
    public Properties getProperties() {
        Properties pro = new Properties();
        pro.put("mail.smtp.host", getMailServerHost());
        pro.put("mail.smtp.port", getMailServerPort());
        pro.put("mail.smtp.auth", getValidate());
        return pro;
    }

    public String getMailServerHost() {
        if ("".equals(mailServerHost) || null == mailServerHost || "null".equals(mailServerHost)) {
            mailServerHost = PropertiesUtil.getValue("mail.server.host");
        }
        return mailServerHost;
    }

    public void setMailServerHost(String mailServerHost) {
        this.mailServerHost = mailServerHost;
    }

    public String getMailServerPort() {
        if ("".equals(mailServerPort) || null == mailServerPort || "null".equals(mailServerPort)) {
            mailServerPort = PropertiesUtil.getValue("mail.server.port");
        }
        return mailServerPort;
    }

    public void setMailServerPort(String mailServerPort) {
        this.mailServerPort = mailServerPort;
    }

    public String getFromAddress() {
        if ("".equals(fromAddress) || null == fromAddress || "null".equals(fromAddress)) {
            fromAddress = PropertiesUtil.getValue("mail.server.user.address");
        }
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String[] getToAddress() {
        return toAddress;
    }

    public void setToAddress(String[] toAddress) {
        this.toAddress = toAddress;
    }

    public String[] getToBlindCarbonCopyAddress() {
        return toBlindCarbonCopyAddress;
    }

    public void setToBlindCarbonCopyAddress(String[] toBlindCarbonCopyAddress) {
        this.toBlindCarbonCopyAddress = toBlindCarbonCopyAddress;
    }

    public String[] getToCarbonCopyAddress() {
        return toCarbonCopyAddress;
    }

    public void setToCarbonCopyAddress(String[] toCarbonCopyAddress) {
        this.toCarbonCopyAddress = toCarbonCopyAddress;
    }

    public String getUserName() {
        if ("".equals(userName) || null == userName || "null".equals(userName)) {
            userName = PropertiesUtil.getValue("mail.server.user.name");
        }
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if ("".equals(password) || null == password || "null".equals(password)) {
            password = PropertiesUtil.getValue("mail.server.user.password");
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getAttachFileNames() {
        return attachFileNames;
    }

    public void setAttachFileNames(String[] attachFileNames) {
        this.attachFileNames = attachFileNames;
    }

    public String getFromNick() {
        if ("".equals(fromNick) || null == fromNick || "null".equals(fromNick)) {
            fromNick = PropertiesUtil.getValue("mail.server.user.nick");
        }
        return fromNick;
    }

    public void setFromNick(String fromNick) {
        this.fromNick = fromNick;
    }

    public String getValidate() {
        if ("".equals(validate) || null == validate || "null".equals(validate)) {
            validate = PropertiesUtil.getValue("mail.server.auth");
        }
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

}
