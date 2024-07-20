/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import com.github.houbb.sensitive.word.support.deny.WordDenys;
import com.github.houbb.sensitive.word.support.ignore.SensitiveWordCharIgnores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author yuwei
 * @version $Id: SensitiveWordConfig.java, v 0.1 2024年07月19日 10:02 PM yuwei Exp $
 */
@Configuration
public class SensitiveWordConfig {

    @Autowired
    private MyDdWordDeny myDdWordDeny;

    /**
     * 初始化引导类
     * @return 初始化引导类
     * @since 1.0.0
     */
    @Bean
    public SensitiveWordBs sensitiveWordBs() {
        return SensitiveWordBs.newInstance()
                .wordDeny(WordDenys.chains(WordDenys.defaults(), myDdWordDeny))
                // 高亮敏感词
                .wordReplace(new HighLineWordReplace())
                // 指定忽略的字符策略
                //.charIgnore(SensitiveWordCharIgnores.specialChars())
                // 各种其他配置
                .init();
    }

}