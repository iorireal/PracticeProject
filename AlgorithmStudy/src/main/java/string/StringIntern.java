package string;

import java.util.Random;

/**
 * @Author: LUHAO
 * @Date: 上午10:20 2017/12/26
 * @Description:
 */
public class StringIntern {
    static final int MAX = 100000;
    static final String[] arr = new String[MAX];

    public static void main(String[] args) throws Exception {
        String s1 = "Hello";
        String s2 = new String("Hello");
        s2 = s2.intern();
        if (s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }
    }

    private static void compareIsIntern() {
        //为长度为10的Integer数组随机赋值
        Integer[] sample = new Integer[10];
        Random random = new Random(1000);
        for (int i = 0; i < sample.length; i++) {
            sample[i] = random.nextInt();
        }
        //记录程序开始时间
        long t = System.currentTimeMillis();
        //使用/不使用intern方法为10万个String赋值，值来自于Integer数组的10个数
        for (int i = 0; i < MAX; i++) {
            arr[i] = new String(String.valueOf(sample[i % sample.length]));
//            arr[i] = new String(String.valueOf(sample[i % sample.length])).intern();
        }
        System.out.println((System.currentTimeMillis() - t) + "ms");
        System.gc();
    }
}
