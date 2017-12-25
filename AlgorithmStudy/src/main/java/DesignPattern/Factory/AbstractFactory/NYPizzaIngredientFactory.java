package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
