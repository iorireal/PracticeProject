package DesignPattern.Factory.AbstractFactory;

import org.apache.commons.lang.StringUtils;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (StringUtils.isEmpty(type)) {
            PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
            Dough dough = pizzaIngredientFactory.createDough();
            Cheese cheese = pizzaIngredientFactory.createCheese();
            pizza = new Pizza(dough, cheese);
        }
        return  pizza;
    }
}
