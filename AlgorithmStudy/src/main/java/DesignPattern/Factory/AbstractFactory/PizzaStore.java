package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
