
package zyh.factory;

import zyh.service.AccountService;
import zyh.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GG_B
 * @version 1.0
 */
public class BeanFactory {
    /*用于创建Service对象的代理工厂*/
    private AccountService accountService;
    private TransactionManager transactionManager;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    //    获取AccountService的代理对象
    public AccountService getAccountService(){
        AccountService proxy = (AccountService) Proxy.newProxyInstance(AccountService.class.getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    if (method.getName().equals("transfer")){
                        transactionManager.beginTransaction();
                        method.invoke(accountService,args);
                        transactionManager.commit();
                    }
                }catch (Exception e){
                    transactionManager.rollback();
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }finally {
                    transactionManager.release();
                }
                return null;
            }
        });
        return proxy;
    }
}


