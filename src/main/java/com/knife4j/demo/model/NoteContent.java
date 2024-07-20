/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author yuwei
 * @version $Id: NoteContent.java, v 0.1 2024年07月20日 12:01 AM yuwei Exp $
 */

@Data
public class NoteContent {

    @ApiModelProperty(value = "内容")
    private String content;
}