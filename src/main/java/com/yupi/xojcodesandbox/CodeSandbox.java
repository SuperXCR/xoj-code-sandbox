package com.yupi.xojcodesandbox;

import com.yupi.xojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.xojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
