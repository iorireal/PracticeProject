package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese () {
        System.out.println("This is "+ this.getClass().getSimpleName());
    }
}
