package Sample;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2020,2,1);

        LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());

        int dayOfMonth = localDate2.getDayOfMonth();

        System.out.println(dayOfMonth);

    }

}
