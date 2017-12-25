package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class ThinCrustDough implements Dough {
    public ThinCrustDough () {
        System.out.println("This is "+this.getClass().getName());
    }

}
