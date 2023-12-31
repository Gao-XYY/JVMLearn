package com.gao.java;

/**
 * 演示栈中的异常情况
 *
 * 默认情况下: count : 11420
 * 设置栈的大小: -Xss256k : count : 2465
 *
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {

        System.out.println(count);

        count++;

        main(args); //StackOverflowError

    }

}
