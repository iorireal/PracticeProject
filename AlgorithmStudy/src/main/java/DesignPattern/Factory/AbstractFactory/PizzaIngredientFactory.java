package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
}
