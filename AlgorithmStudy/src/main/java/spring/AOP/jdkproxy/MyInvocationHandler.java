package spring.AOP.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/11/8.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    MyInvocationHandler() {
        super();
    }

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 程序执行前加入逻辑，MethodBeforeAdviceInterceptor
        System.out.println("before-----------------------------");
        // 程序执行
        Object result = method.invoke(target, args);
        // 程序执行后加入逻辑，MethodAfterAdviceInterceptor
        System.out.println("after------------------------------");
        return result;
    }
}
