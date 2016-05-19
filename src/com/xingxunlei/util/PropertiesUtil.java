/**
 * PropertiesUtil.java
 * com.xingxunlei.util
 *
 * Function： 获取properties文件值工具类
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-19 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
*/

package com.xingxunlei.util;

import java.util.ResourceBundle;

/**
 * ClassName:PropertiesUtil
 * Function: 获取properties文件值工具类
 *
 * @author   Simon
 * @version  
 * @since    Ver 1.1
 * @Date	 2016-5-19		下午2:24:01
 *
 * @see 	 
 */
public class PropertiesUtil {
    
    private static ResourceBundle rb;

    static {
        rb = ResourceBundle.getBundle("config-mail");
    }

    public static String getValue(String key) {
        return rb.getString(key);
    }

}

