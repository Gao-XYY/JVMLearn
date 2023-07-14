package com.gao.java1;

/**
 * 1、如果一个类加载器收到了类加载请求，它并不会自己先去加载，而是把这个请求委托给父类的加载器去执行;
 * 2、如果父类加载器还存在其类加载器，则进一步向上委托，依次递归，请求最终将到达顶层的启动类加载器;
 * 3、如果父类加载器可以完成类加载任务，就成功返回，倘若父类加载器无法完成此加载任务，子加载器才会尝试自已去加载，这就是双亲委派模式。
 */
public class StringTest {

    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        System.out.println("hello,gao.com");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }

}





