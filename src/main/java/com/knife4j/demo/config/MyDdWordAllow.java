/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordAllow;
import com.knife4j.demo.util.IoUtils;
import java.util.List;

/**
 *
 * @author yuwei
 * @version $Id: MyDdWordDeny.java, v 0.1 2024年07月19日 9:55 PM yuwei Exp $
 */
public class MyDdWordAllow implements IWordAllow {


    @Override
    public List<String> allow() {
        return IoUtils.readWords("白名单词库.txt");
    }
}