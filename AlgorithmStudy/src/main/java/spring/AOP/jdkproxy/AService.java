package spring.AOP.jdkproxy;

/**
 * 被代理类，即目标类target
 * Created by Administrator on 2017/11/8.
 */
public class AService implements Service
{
    @Override
    public void add() {
        System.out.println("AService add>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void update() {
        System.out.println("AService update>>>>>>>>>>>>>>>>>>");
    }
}
