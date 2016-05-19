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
        String[] to = { "***@126.com" };
        mailInfo.setToAddress(to);
        mailInfo.setSubject("***");
        String body = "***<a href=\"http://www.baidu.com\">百度</a>***";
        mailInfo.setContent(body);
        System.out.println(MailSendUtil.sendHtmlMail(mailInfo));
    }

}

