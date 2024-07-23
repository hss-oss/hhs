/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * IO流工具类
 *
 * @author yuwei
 * @version $Id: LocalDictionary.java, v 0.1 2024年07月20日 10:22 PM yuwei Exp $
 */
public class IoUtils {

    /**
     * 读取词库
     *
     * @return
     */
    public static List<String> readWords(String fileName) {
        String rootPath = System.getProperty("user.dir");
        String filePath = rootPath + File.separator + fileName;
        System.out.println("=============文件地址" + filePath);
        List<String> words = new ArrayList<>();
        try {
            InputStream in =new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                words.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}