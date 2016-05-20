/**
 * XmlUtil.java
 * com.xingxunlei.util
 *
 * Function： 读取xml模板文件内容
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-20 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
 */

package com.xingxunlei.util;

import java.io.File;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ClassName:XmlUtil
 * Function:  读取xml模板文件内容
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2016-5-20 上午10:49:16
 * 
 * @see
 */
public class XmlUtil {

    public String read(String path) {
        String str = null;
        str = reader(path);
        return str;
    }

    private String reader(String path) {
        SAXReader reader = new SAXReader();
        String str = null;

        try {
            Document d = reader.read(new File(path));
            Element e = d.getRootElement();
            Element htmle = e.element("html");
            str = htmle.asXML();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return str;
    }

}
