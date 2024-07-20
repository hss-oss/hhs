/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordAllow;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 *
 * @author yuwei
 * @version $Id: MyDdWordDeny.java, v 0.1 2024年07月19日 9:55 PM yuwei Exp $
 */
@Component
public class MyDdWordAllow extends LocalDictionary implements IWordAllow {


    @Override
    public List<String> allow() {
        return readWords("白名单词库.txt");
    }
}