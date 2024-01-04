package com.yupi.xojcodesandbox.security;

import java.security.Permission;

/**
 * @Author : SuperXCR
 * @Create 2024-01-04
 *
 * 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager{

    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        super.checkPermission(perm);
    }

    @Override
    public void checkRead(String file, Object context) {
        super.checkRead(file, context);
    }

    @Override
    public void checkWrite(String file) {
        super.checkWrite(file);
    }

    @Override
    public void checkDelete(String file) {
        super.checkDelete(file);
    }

    @Override
    public void checkConnect(String host, int port) {
        super.checkConnect(host, port);
    }
}
