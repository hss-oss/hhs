/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordDeny;
import com.knife4j.demo.util.IoUtils;
import java.util.List;

/**
 *
 * @author yuwei
 * @version $Id: MyDdWordDeny.java, v 0.1 2024年07月19日 9:55 PM yuwei Exp $
 */
public class MyDdWordDeny implements IWordDeny {


    @Override
    public List<String> deny() {
        return IoUtils.readWords("敏感词库.txt");
    }
}