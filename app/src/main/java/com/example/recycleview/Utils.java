package com.example.recycleview;

import java.util.Date;
public class Utils {
    public static Date createDateForHour(int hour){
        Date date = new Date();
        date.setTime(hour * 360000);
        return date;
    }
}
