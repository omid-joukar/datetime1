import java.util.Calendar;
import java.util.Date;

/**
 * Created by KPS on 7/14/2020.
 */
public class Main {
    public static void main(String[] args) {
        int year = 2020;
        int month = 6;
        int day = 13;
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DAY_OF_MONTH,day);
        System.out.println(cal.getTime());
        
    }
}
