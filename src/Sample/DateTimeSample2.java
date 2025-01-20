package Sample;

import java.time.LocalDateTime;

public class DateTimeSample2 {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime =
        LocalDateTime.of(2018,1,2,3,4,5,999999999);
        System.out.println("日付と時間：" + localDateTime);

        int year = localDateTime.getYear();
        System.out.println("年：" + year);

    

        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("日："  + dayOfMonth);

    }

}
