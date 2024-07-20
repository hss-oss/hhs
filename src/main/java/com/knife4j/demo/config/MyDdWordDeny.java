/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordDeny;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuwei
 * @version $Id: MyDdWordDeny.java, v 0.1 2024年07月19日 9:55 PM yuwei Exp $
 */
@Component
public class MyDdWordDeny implements IWordDeny {


    @Override
    public List<String> deny() {
        return readBlackWords();
    }


    /**
     * 读取黑名单
     *
     * @return
     */
    private List<String> readBlackWords() {
        String rootPath = System.getProperty("user.dir");
        String filePath = rootPath + File.separator + "敏感词库.txt";
        System.out.println("=============文件地址" + filePath);
        List<String> blackWords = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                blackWords.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return blackWords;
    }


}