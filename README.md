# mail.simon
java mail 小实例

====================测试方法====================
1.修改config-mail.properties 文件
2.修改com.xingxunlei 包下的Test.java。
3.运行Test.java

====================包/文件说明====================
1. com.xingxunlei.bean
         邮件发送所需的一些bean

1.1 MailAuthenticator.java
	邮件服务器认证信息Bean
1.2 MailSenderInfo.java
	邮件发送服务器的相关信息Bean
	
2. com.xingxunlei.util
         邮件发送的一些工具类

2.1 MailSendUtil.java
	发送邮件工具类
	此类提供两种发送邮件的方式（普通邮件、HTML邮件）。支持附件等操作。
	
2.2 PropertiesUtil.java
	获取properties文件值工具类
	此类提供了获取properties文件value的方法。

