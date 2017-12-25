package DesignPattern.Adapter;

/**
 * Created by LUHAO on 2017/11/21.
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner (String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
