package com.yupi.xojcodesandbox;

import com.yupi.xojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.xojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @Author : SuperXCR
 * @Create 2024-01-05
 *
 * Java 原生实现，直接复用
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate{
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
