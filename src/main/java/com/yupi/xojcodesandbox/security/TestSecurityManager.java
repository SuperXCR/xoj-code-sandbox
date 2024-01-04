package com.yupi.xojcodesandbox.security;


/**
 * @Author : SuperXCR
 * @Create 2024-01-04
 */
public class TestSecurityManager extends SecurityManager{
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());

        
    }
}
