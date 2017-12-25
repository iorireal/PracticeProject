package DesignPattern.Factory.FactoryMethod;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class BankCard extends Product {
    private String owner;
    private String bankName;
    BankCard(String owner, String bankName) {
        this.owner = owner;
        this.bankName = bankName;
        System.out.println("制作"+owner+"的"+bankName+"银行卡。");
    }
    @Override
    public void use() {
        System.out.println("使用"+owner+"的"+bankName+"银行卡。");
    }

    public String getBankName() {
        return bankName;
    }

    public String getOwner() {
        return owner;
    }
}
