package com.yupi.xojcodesandbox.security;

import java.security.Permission;

/**
 * @Author : SuperXCR
 * @Create 2024-01-04
 *
 * 禁用所有权限安全管理器
 */
public class DenySecurityManager extends SecurityManager{

    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}
