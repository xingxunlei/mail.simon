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
import com.xingxunlei.util.FileUtil;
import com.xingxunlei.util.MailSendUtil;
import com.xingxunlei.util.XmlUtil;
import java.text.MessageFormat;

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
        
        // 测试xml
        mailInfo.setSubject("测试一下xml");
        String str = new XmlUtil().read("src\\simple.xml");
        Object[] obj = new Object[]{"我是xml"};
        str = MessageFormat.format(str, obj);
        mailInfo.setContent(str);
        System.out.println(MailSendUtil.sendHtmlMail(mailInfo));
        
        // 测试html
        mailInfo.setSubject("测试一下html");
        str = FileUtil.read("src\\simple.html");
        obj = new Object[]{"我是html"};
        for(int i=0;i<obj.length;i++){
            str = str.replace("{"+i+"}", obj[i].toString());
        }
        mailInfo.setContent(str);
        System.out.println(MailSendUtil.sendHtmlMail(mailInfo));
    }

}

