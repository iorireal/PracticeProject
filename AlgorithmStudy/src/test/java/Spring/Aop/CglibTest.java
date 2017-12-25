package Spring.Aop;

import spring.AOP.cglibproxy.Base;
import spring.AOP.cglibproxy.CglibProxy;
import spring.AOP.cglibproxy.Factory;

/**
 * Created by Administrator on 2017/11/30.
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Base base = (Base) Factory.getInstance(Base.class,proxy);
        base.add();
    }
}
