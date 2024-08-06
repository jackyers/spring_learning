package zyh.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author GG_B
 * @version 1.0
 */
@Component("aspect")
@Aspect
/*切面类*/
public class MyAspect {
    //前置通知
    @Before(value = "execution(* zyh.service.UserServiceImpl.deleteUser(..))")
    public void checkPrivilege() {
        System.out.println("开启了权限校验");
    }
    //后置通知
    @AfterReturning(value = "execution(* zyh.service.UserServiceImpl.findAll(..))")
    public void printLog(){
        System.out.println("打印了运行日志");
    }
    //环绕通知
    @Around(value = "execution(* zyh.service.UserServiceImpl.updateUser(..))")
    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("环绕通知1");
            joinPoint.proceed();
            System.out.println("环绕通知2");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    //抛出异常通知
    @AfterThrowing(value = "execution(* zyh.service.UserServiceImpl.addUser(..))")
    public void throwing(){
        System.out.println("抛出了运行时异常");
    }
    //最终通知
    @After(value = "execution(* zyh.service.UserServiceImpl.addUser(..))")
    public void after(){
        System.out.println("最终通知");
    }
}
