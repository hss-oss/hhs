/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author yuwei
 * @version $Id: CommonResult.java, v 0.1 2024年07月20日 12:15 AM yuwei Exp $
 */
@Data
public class CommonResult<T> {

    @ApiModelProperty(value = "结果")
    private T res;

    @ApiModelProperty(value = "是否成功")
    private boolean isSuccess;

    public CommonResult() {

    }

    public CommonResult ok(T res) {
        this.res = res;
        this.isSuccess = true;
        return this;
    }
}