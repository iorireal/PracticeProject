package Spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.ioc.Animal;

/**
 * Created by LUHAO on 2017/11/25.
 */
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "web/WEB-INF/applicationContext.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.say();
    }
}
