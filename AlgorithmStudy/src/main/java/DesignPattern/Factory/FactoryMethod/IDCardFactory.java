package DesignPattern.Factory.FactoryMethod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class IDCardFactory extends Factory {
    private List owners = Lists.newArrayList();
    @Override
    public Product createProduct(String... params) {
        if(params.length == 1)
            return new IDCard(params[0]);
        return null;
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
