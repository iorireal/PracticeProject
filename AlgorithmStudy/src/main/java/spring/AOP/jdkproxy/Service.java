package spring.AOP.jdkproxy;

/**
 *  该类是所有被代理类的接口类，jdk实现的代理要求被代理类基于统一的接口
 * Created by Administrator on 2017/11/8.
 */
public interface Service {
    public void add();
    public void update();
}
