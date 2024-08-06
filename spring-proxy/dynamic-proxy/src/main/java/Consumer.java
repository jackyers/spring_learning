import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author GG_B
 * @version 1.0
 */
public class Consumer {
    public static void main(final String[] args) {
        final Producer producer = new Producer();
        producer.buyProduct("小王");

        Producer proxy = (Producer) Enhancer.create(Producer.class, new MethodInterceptor() {
//            * @param o 当前代理对象的引用
//            * @param method 代理对象需要执行的方法
//            * @param objects 代理对象执行该方法需要用到的参数
//            * @param methodProxy 当前执行方法的代理对象（不常用）
//            * @return 返回值也是跟被代理对象执行方法的返回值一样
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if(method.getName().equals("buyProduct")){
                    method.invoke(producer,objects);
                }
                return null;
            }
        });
        proxy.buyProduct("小刚");
    }
}
