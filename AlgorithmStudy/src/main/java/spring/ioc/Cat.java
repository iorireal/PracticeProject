package spring.ioc;

/**
 * Created by LUHAO on 2017/11/25.
 */
public class Cat implements Animal{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void say() {
        System.out.printf("I'm "+name+" cat");
    }
}
