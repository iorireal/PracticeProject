package DesignPattern.Factory.FactoryMethod;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("A");
        Product card2 = factory.create("B");
        Product card3 = factory.create("C");
        card1.use();
        card2.use();
        card3.use();

        Factory bankFactory = new BankCardFactory();
        Product bank = bankFactory.create(new String[]{"A","工商银行"});
        bank.use();
    }
}
