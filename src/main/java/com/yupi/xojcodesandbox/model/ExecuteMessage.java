package com.yupi.xojcodesandbox.model;

import lombok.Data;

/**
 * @Author : SuperXCR
 * @Create 2024-01-04
 *
 * 进程执行信息
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;
}
