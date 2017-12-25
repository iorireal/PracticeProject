package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class ThickCrustDough implements Dough {
    public ThickCrustDough () {
        System.out.println("This is "+this.getClass().getName());
    }
}
