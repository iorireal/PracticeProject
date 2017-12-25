package DesignPattern.Adapter;

/**
 * Created by LUHAO on 2017/11/21.
 */
public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
        Print2 p2 = new PrintBanner2("Helleo");
        p2.printStrong();
        p2.printWeak();
    }
}
