package lecture5.examples;

import java.util.Calendar;
import java.util.Date;

public class  DateAndCalendarExample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());
    }
}
