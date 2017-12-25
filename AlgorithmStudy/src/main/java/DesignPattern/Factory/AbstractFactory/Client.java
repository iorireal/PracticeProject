package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza piazza = pizzaStore.orderPizza("");
    }
}
