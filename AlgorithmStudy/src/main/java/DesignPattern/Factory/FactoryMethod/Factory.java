package DesignPattern.Factory.FactoryMethod;

/**
 * Created by LUHAO on 2017/11/29.
 */
public abstract class Factory {
    public final Product create(String... params){
        Product p = createProduct(params);
        registerProduct(p);
        return p;
    }
    public abstract Product createProduct(String... params);
    public abstract void registerProduct(Product product);
}
