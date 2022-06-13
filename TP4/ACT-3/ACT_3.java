import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ACT_3{
    public static void main(String args[]){
        LocalDate des = LocalDate.of(2015, 03, 15);
        LocalDate has = LocalDate.of(2015, 03, 16);

        System.out.println(ChronoUnit.DAYS.between(des, has) + 1);
    }
}