package spring.AOP.cglibproxy;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/11/30.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Intercept {

}
