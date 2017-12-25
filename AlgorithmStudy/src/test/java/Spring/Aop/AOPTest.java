package Spring.Aop;

import spring.AOP.cglibproxy.Base;
import spring.AOP.cglibproxy.CglibProxy;
import spring.AOP.cglibproxy.Factory;
import spring.AOP.jdkproxy.AService;
import spring.AOP.jdkproxy.MyInvocationHandler;
import spring.AOP.jdkproxy.Service;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/11/8.
 */
public class AOPTest {
    public static void main1(String[] args) {
        Service aService = new AService();
        MyInvocationHandler handler = new MyInvocationHandler(aService);
        // Proxy为InvocationHandler实现类动态创建一个符合某一接口的代理实例
        Service aServiceProxy = (Service) Proxy.newProxyInstance(aService
                .getClass().getClassLoader(), aService.getClass()
                .getInterfaces(), handler);
        // 由动态生成的代理对象来aServiceProxy 代理执行程序，其中aServiceProxy 符合Service接口
        aServiceProxy.add();
        System.out.println();
        aServiceProxy.update();
        // 以下是对B的代理
        // Service bService = new BService();
        // MyInvocationHandler handler = new MyInvocationHandler(bService);
        // Service bServiceProxy = (Service) Proxy.newProxyInstance(bService
        // .getClass().getClassLoader(), bService.getClass()
        // .getInterfaces(), handler);
        // bServiceProxy.add();
        // System.out.println();
        // bServiceProxy.update();
    }
}
