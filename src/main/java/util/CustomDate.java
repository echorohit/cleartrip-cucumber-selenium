package util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomDate {

    public static String dateFrom(String daysFromToday) {
        DateFormat dateFormat = new SimpleDateFormat("E, d MMM, yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE , Integer.parseInt(daysFromToday));
        return dateFormat.format(c.getTime());
    }
}
