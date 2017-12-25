package DesignPattern.Factory.FactoryMethod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class BankCardFactory extends Factory {
    List owners = Lists.newArrayList();
    List banks = Lists.newArrayList();

    @Override
    public Product createProduct(String... params) {
        if(params.length == 2)
            return new BankCard(params[0], params[1]);
        return null;
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((BankCard)product).getOwner());
        banks.add(((BankCard)product).getBankName());
    }

    public List getOwners() {
        return owners;
    }

    public List getBanks() {
        return banks;
    }
}
