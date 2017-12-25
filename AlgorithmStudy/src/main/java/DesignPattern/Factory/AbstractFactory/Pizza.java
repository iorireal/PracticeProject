package DesignPattern.Factory.AbstractFactory;

/**
 * Created by LUHAO on 2017/12/5.
 */
public class Pizza {
    private Dough dough;
    private Cheese cheese;

    public Pizza(Dough dough, Cheese cheese) {
        this.dough = dough;
        this.cheese = cheese;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
