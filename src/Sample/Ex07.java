package Sample;

import java.time.LocalDate;
import java.time.Month;

public class Ex07 {

    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2000,8,17);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfMonth + "日です");
        

    }

}
