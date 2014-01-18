package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Spike {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("E, d MMM,yyyy");
        //get current date time with Date()
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE , 5);
        System.out.println(dateFormat.format(c.getTime()));
    }}
               //Sat, 18 Jan, 2014
               //Sat,18 007, 2014   actual


