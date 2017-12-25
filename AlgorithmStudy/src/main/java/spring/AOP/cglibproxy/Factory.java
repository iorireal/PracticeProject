package spring.AOP.cglibproxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import spring.AOP.jdkproxy.Service;

/**
 * 工厂类，生成增强过的目标类（已加入切入逻辑）
 *
 * Created by Administrator on 2017/11/8.
 */
public class Factory {
    /**
     * 获得增强之后的目标类，即添加了切入逻辑advice之后的目标类
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(Class<T> superClass, Callback callback) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(superClass);
        //回调方法的参数为代理类对象CglibProxy，最后增强目标类调用的是代理类对象CglibProxy中的intercept方法
        enhancer.setCallback(callback);
        // 此刻，base不是单纯的目标类，而是增强过的目标类
        return (T) enhancer.create();
    }
}
