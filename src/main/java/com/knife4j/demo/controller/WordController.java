/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * Official Web Site: http://www.xiaominfo.com.
 */
package com.knife4j.demo.controller;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.knife4j.demo.model.CommonResult;
import com.knife4j.demo.model.NoteContent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since:knife4j-spring-boot-demo
 * @auth <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/8/6 23:42
 */
@Slf4j
@Api(tags = "敏感词")
@ApiSupport(author = "xiaoymin@foxmail.com",order = 278)
@RestController
@RequestMapping(value = "/word",produces = MediaType.APPLICATION_JSON_VALUE)
public class WordController {

    @Autowired
    private SensitiveWordBs sensitiveWordBs;


    @ApiOperation(value = "敏感词过滤")
    @PostMapping("/sensitive")
    @ResponseBody
    public CommonResult sensitive(@RequestBody NoteContent noteContent){

        CommonResult result = new CommonResult();

        if (!StringUtils.hasText(noteContent.getContent())) {
            return result.ok("");
        }
        if (!sensitiveWordBs.contains(noteContent.getContent())) {
            return result.ok(noteContent.getContent());
        }

        // 替换高亮处理过滤后的文本
        return result.ok(sensitiveWordBs.replace(noteContent.getContent()));
    }

    @ApiOperation(value = "重新加载载敏感词库")
    @PostMapping("/reload_dictionary")
    @ResponseBody
    public String reloadDictionary(){
        sensitiveWordBs.init();

        return "成功";
    }
}
