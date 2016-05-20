/**
 * FileUtil.java
 * com.xingxunlei.util
 *
 * Function： 读取模板内容 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016-5-20 		Simon
 *
 * Copyright (c) 2016, 91Bee All Rights Reserved.
 */

package com.xingxunlei.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName:FileUtil 
 * Function: 读取模板内容
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2016-5-20 上午11:24:31
 * 
 * @see
 */
public class FileUtil {

    public String read(String path) {
        String str = null;
        str = reader(path);
        return str;
    }

    public static String reader(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                sbf.append(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return sbf.toString();
    }

}
