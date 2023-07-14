package com.gao.java1;



public class ClassLoaderTest2 {

    public static void main(String[] args) {
        try {
            //1.获取当前类的ClassLoader
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.获取当前线程上下文的ClassLoader
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.获取系统的ClassLoader
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);

            //4、获取调用者的ClassLoader
//            DriverManager.getCallerClassLoader();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
