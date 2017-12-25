/**
 * Created by Administrator on 2017/8/14.
 */
public class Test {
    public static void main(String[] args) {
//        ConcurrentMap map = new ConcurrentHashMap();
        Father child = new Children();
        child.tech();
    }
}


class Father {
    public static void tech() {
        System.out.println("father tech");
    }

}

class Children extends Father {
    public static void tech() {
        System.out.println("child tech");
    }
}