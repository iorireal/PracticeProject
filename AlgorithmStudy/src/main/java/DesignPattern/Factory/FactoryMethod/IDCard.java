package DesignPattern.Factory.FactoryMethod;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class IDCard extends Product{
    private String owner;

    IDCard(String owner) {
        System.out.println("制作"+owner+"的ID卡。");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡。");
    }
}
