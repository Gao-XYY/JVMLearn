package com.gao.java1;

public class ClassLoaderTest {

    public static void main(String[] args) {
        //获取系统类加载器 ---> 负责加载classpath或系统属性 java.class.path指定路径下的类库
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层：扩展类加载器 ---> 加载jre/lib/ext子目录
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586


        //获取其上层:获取不到引导类加载器
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);//null


        //对于用户自定义类来说: 默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用引导类加载器进行加载的 --->java的核心类库都是使用引导类加载器进行加载的  ---> JAVA_HOME/jre/lib/rt.jar、resources.jar或sun.boot.class.path路径下的内容
        //启动类加载器只加载报名为java、javax、sun等开头的类
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null


    }

}
