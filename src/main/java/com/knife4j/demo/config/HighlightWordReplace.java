/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordContext;
import com.github.houbb.sensitive.word.api.IWordReplace;
import com.github.houbb.sensitive.word.api.IWordResult;
import com.github.houbb.sensitive.word.utils.InnerWordCharUtils;

/**
 * 高亮
 *
 * @author yuwei
 * @version $Id: HighlightWordReplace.java, v 0.1 2024年07月19日 10:10 PM yuwei Exp $
 */
public class HighlightWordReplace implements IWordReplace {

    @Override
    public void replace(StringBuilder stringBuilder, final char[] rawChars, IWordResult wordResult, IWordContext wordContext) {
        // 获取敏感词
        String sensitiveWord = InnerWordCharUtils.getString(rawChars, wordResult);

        // 除了自定义敏感词替换策略，其余在富文本中转成红色高亮显示
        stringBuilder.append("<span style='color:red'>"+sensitiveWord+"</span>");
    }
}