package zbook;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zack
 */
public class ZTime {

    public static final int MILLIS_IN_WEEK = 604800000;
    public static final int MILLIS_IN_DAY = 86400000;
    private static ZoneId DEFAULT_ZONE_ID = TimeZone.getDefault().toZoneId();

    public static LocalDateTime getDateTimeFromTimestamp(long timestamp) {

        if (timestamp == 0) {
            return null;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), DEFAULT_ZONE_ID);
    }

    public static LocalDate getDateFromTimestamp(long timestamp) {
        //System.out.println("\tLD DefaultTImeZone == : " + DEFAULT_ZONE_ID);
        LocalDateTime date = getDateTimeFromTimestamp(timestamp);
        return date == null ? null : date.toLocalDate();
    }

    public static long getMillisFromDateTime(LocalDateTime ldt) {
        ZonedDateTime zdt = ldt.atZone(DEFAULT_ZONE_ID);

//      System.out.println("\tZone: "+zdt.getZone());
//      System.out.println("\tYear: "+zdt.getYear());
//      System.out.println("\tMonth: "+zdt.getMonth());
//      System.out.println("\tDay: "+zdt.getDayOfMonth());
//      System.out.println("\tDay of week: "+zdt.getDayOfWeek());
//      System.out.println("\tHour: "+zdt.getHour());
//      System.out.println("\tMinute: "+zdt.getMinute());
        return zdt.toInstant().toEpochMilli();
    }
    
    public static int getYear(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        
        
        return ldt == null ? -1 : ldt.atZone(DEFAULT_ZONE_ID).getYear();
    }
    
    public static int getMonthValue(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? -1 : ldt.getMonthValue();
    }
    
    public static java.time.Month getMonth(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? null : ldt.getMonth();
    }
    
    public static int getDay(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? -1 :ldt.getDayOfMonth();
    }
    
    public static int getHour(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? -1 :ldt.getHour();
    }
    
    public static int getMinute(long timestamp)
    {
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? -1 :ldt.getMinute();
    }
    
    public static java.time.DayOfWeek getDayOfWeek(long timestamp){
        LocalDateTime ldt = getDateTimeFromTimestamp(timestamp);
        return ldt == null ? null : ldt.getDayOfWeek();
    }

    static String MonthDayYearDate(long st) {
        String str = "";
        str += getMonth(st).toString().substring(0,3)+". ";
        str += Integer.toString(getDay(st))+", ";
        str += Integer.toString(getYear(st));
        return str;
    }
    
    static String _24HourTime(long st){
        String str = "";
        str += getHour(st) < 10 ? "0"+Integer.toString(getHour(st)) : Integer.toString(getHour(st));
        str += ":";
        str += getMinute(st) < 10 ? "0"+Integer.toString(getMinute(st)) : Integer.toString(getMinute(st));
        
        return str;
    }
    
    static long todayMillis(long timestamp)
    {
        LocalDateTime ldt = LocalDateTime.of(getYear(timestamp),getMonth(timestamp),getDay(timestamp),0,0);
        return getMillisFromDateTime(ldt);
    }

}
