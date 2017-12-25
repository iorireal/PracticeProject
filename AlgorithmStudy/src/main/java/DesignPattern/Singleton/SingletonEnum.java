package DesignPattern.Singleton;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * https://www.cnblogs.com/cielosun/p/6596475.html
 * Created by LUHAO on 2017/12/5.
 */
public enum SingletonEnum {
    INSTANCE;
    public void getInstance(){

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
