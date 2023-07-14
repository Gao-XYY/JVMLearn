package com.gao.java;

public class ClassInitTest {

    private static int num = 5;

    static {
        num = 10;
        number = 20;
        System.out.println(num);
//        System.out.println(number);//报错，非法的前向引用
    }
//    static int num = 1;

    private static int number = 10; //linking之prepare: number = 0 ---> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }

}
