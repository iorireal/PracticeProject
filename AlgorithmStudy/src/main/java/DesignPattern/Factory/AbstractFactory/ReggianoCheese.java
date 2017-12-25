package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class ReggianoCheese implements Cheese {
    public ReggianoCheese () {
        System.out.println("This is "+this.getClass().getSimpleName());
    }
}
