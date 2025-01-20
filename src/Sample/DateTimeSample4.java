package Sample;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("現在の日付：" + localDate);

        LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("月末は" + localDate2);
        // System.out.println("    月末は" + localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }

}
