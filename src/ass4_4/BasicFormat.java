package ass4_4;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicFormat {

    static SimpleDateFormat dateFormat;
    static DecimalFormat intFormat;
    static DecimalFormat dollarFormat;
    static MessageFormat personFormat;

    BasicFormat(){
        dateFormat = new SimpleDateFormat("d MMM yyyy");
        intFormat = new DecimalFormat("#,###");
        dollarFormat = new DecimalFormat("$ #,##0.##");
        personFormat = new MessageFormat("{0}, {1} [{2}]");
    }

    public static String formatDate(Date date) { return dateFormat.format(date); }
    public static String formatDate(int year, int month, int day) { return dateFormat.format((new GregorianCalendar(year, month, day).getTime())); }
    public static String formatLong(long number) { return intFormat.format(number); }
    public static String formatMoney(double amount) { return dollarFormat.format(amount); }
    public static String formatPerson(String firstName, String lastName, String userName) {
        return personFormat.format((new Object[]{firstName, lastName, userName})); }

}


