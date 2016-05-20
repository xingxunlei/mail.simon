/**
 * Test.java
 * com.xingxunlei
 *
 * Function： 邮件发送test
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-19 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
*/

package com.xingxunlei;

import java.text.MessageFormat;

import com.xingxunlei.util.HtmlUtil;

import com.xingxunlei.bean.MailSenderInfo;
import com.xingxunlei.util.MailSendUtil;

/**
 * ClassName:Test
 * Function: 邮件发送test
 *
 * @author   Simon
 * @version  
 * @since    Ver 1.1
 * @Date	 2016-5-19		下午2:57:59
 *
 * @see 	 
 */
public class Test {
    
    public static void main(String[] args) {
        MailSenderInfo mailInfo = new MailSenderInfo();
        String[] to = { "***@foxmail.com" };
        mailInfo.setToAddress(to);
        mailInfo.setSubject("测试一下");
        String path = "src\\simple.xml";
        String str = new HtmlUtil().read(path);
        Object[] obj = new Object[]{"我是大哥大"};
        str = MessageFormat.format(str, obj);
        mailInfo.setContent(str);
        System.out.println(MailSendUtil.sendHtmlMail(mailInfo));
    }

}

