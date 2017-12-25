package AOP;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by LUHAO on 2017/11/29.
 */
public class SampleTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 22);
        Date postTime = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 24);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date setTime = cal.getTime();
        System.out.println(DateFormatUtils.format(now, "yyyy-MM-dd HH:mm:ss"));
        System.out.println( DateFormatUtils.format(setTime, "yyyy-MM-dd HH:mm:ss") + "  " + now.after(setTime));
        System.out.println( DateFormatUtils.format(postTime, "yyyy-MM-dd HH:mm:ss") + "  " + postTime.after(setTime));
    }
}
