package Sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample5 {

    public static void main(String[] args) {
        
        System.out.println("LocalDateTimeからフォーマットされた文字列へ変換");
        LocalDateTime localDateTime  = LocalDateTime.now();

        System.out.println("デフォルトの出力形式" + localDateTime);
        DateTimeFormatter formatter
        = DateTimeFormatter.ofPattern("yyyy年 MM月 dd日 HH時 MM分 SS秒");
        String format = localDateTime.format(formatter);
        System.out.println(format);


        System.out.println("===========================");
        System.out.println("文字列からLocalDateTimeへ変換");
        String strLocalDateTime = "2018/12/31/23:59:59";
        DateTimeFormatter formatter2
        = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
        LocalDateTime localDateTime2
        = LocalDateTime.parse(strLocalDateTime,formatter2);

        System.out.println("文字列から変換されたLocalDateTime:" + localDateTime2);
    }

}
