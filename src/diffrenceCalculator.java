import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class diffrenceCalculator {
    static void find(Date join_date, Date leave_date) throws ParseException {
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");


            Date date1 = join_date;
            Date date2 = leave_date;

            long time_difference = date2.getTime() - date1.getTime();

            long years_difference = (TimeUnit.MILLISECONDS.toDays(time_difference) / 365)*(-1);
            long days_diffrence= (TimeUnit.MILLISECONDS.toDays(time_difference) * (-1));
            long hour_difference = (TimeUnit.MILLISECONDS.toDays(time_difference) *(-24));

            System.out.println("Masz " + years_difference + " lat");
            // System.out.println("Masz bombelku " + days_diffrence+ " dni");

            if (years_difference>=18) {
                System.out.println("Jesteś pełnoletni");
        }   else {
                System.out.println("Jesteś niepełnoletni");
            }

    }
    }

