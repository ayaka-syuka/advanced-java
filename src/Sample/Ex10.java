package Sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex10 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,7,27);

        DateTimeFormatter formatter
        = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String format = localDate.format(formatter);
        System.out.println(format);

        DateTimeFormatter formatter2
        = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        String format2 = localDate.format(formatter2);
        System.out.println(format2);

        DateTimeFormatter formatter3
        = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)");

        String format3 = localDate.format(formatter3);
        System.out.println(format3);
            
    }
    }


