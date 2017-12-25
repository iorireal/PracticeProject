package DesignPattern.Adapter;

/**
 * Created by LUHAO on 2017/11/21.
 */
public class PrintBanner2 extends Print2 {
    private  Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
