package com.yupi.xojcodesandbox.unsafeCode;

/**
 * @Author : SuperXCR
 * @Create 2024-01-04
 */
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}
