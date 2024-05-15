package Dates;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1=LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);
        LocalTime localTime=LocalTime.from(ZonedDateTime.now());
        System.out.println(localTime);
        String s="1995-05-11";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate2=LocalDate.now();
        String s1=localDate2.format(dateTimeFormatter);
        System.out.println(s1);
        LocalDate localDate3=LocalDate.parse(s);
        String s2=localDate3.format(dateTimeFormatter);
        System.out.println(s2);
//        int days=LocalDate.EPOCH(LocalDate.now());
//        System.out.println(days);
        System.out.println(localDate3.isLeapYear());
// 2024%4==0 leapyear
        //2100%400==0 leap year
        String numberStr="$2000";
        String string=numberStr.replace("$","");
        int number = Integer.parseInt(string);
        number = number + 1;
        String incrementedNumberStr = Integer.toString(number);
        System.out.println("Incremented number: $" + incrementedNumberStr);

    }

}
