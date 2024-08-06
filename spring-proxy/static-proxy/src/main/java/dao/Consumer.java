package dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GG_B
 * @version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        final Producer producer = new Producer();
        producer.buyProduct("小明");

        //○ ClassLoader：类加载器：
        //        它是用于加载代理对象字节码的，和被代理对象使用相同的类加载器。是固定写法（写被代理对
        //        象的类加载器）
        //○ Class[]：字节码数组
        //        它是用于让代理对象和被代理对象有相同的方法（只要两者都实现了同一个接口，那么两者的方
        //        法必然相同，所以我们传接口的字节码文件即可）。固定写法（写接口字节码文件）
        //○ InvocationHandler：处理器
        //        用于提供增强的代码，它是让我们写如何代理，我们一般都是写一个该接口的实现类。通常情况
        //        下都是匿名内部类，但不是必须的，此接口的实现类都是谁用谁写。
        ProductDao proxy= (ProductDao)Proxy.newProxyInstance(Producer.class.getClassLoader(),
                                                        producer.getClass().getInterfaces(),
                                                        new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("buyProduct")){
                    method.invoke(producer,args);
                }
                return null;
            }
        });
        proxy.buyProduct("小红");
    }
}
