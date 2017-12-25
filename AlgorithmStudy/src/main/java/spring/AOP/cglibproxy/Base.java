package spring.AOP.cglibproxy;

/**
 * 被代理类，即目标对象target cglib不需要定义目标类的统一接口
 * Created by Administrator on 2017/11/8.
 */
public class Base {
    public void add() {
        System.out.println("add ------------");
    }
}
