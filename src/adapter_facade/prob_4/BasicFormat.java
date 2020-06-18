package adapter_facade.prob_4;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicFormat {
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(date);
    }

    public static String formatDate(int year, int month, int day) {
        return  day + " "+ month +"월 " + year;
    }

    public static String formatLong(long number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }

    public static String formatMoney(double amount) {
        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
        return dollarFormat.format(amount);
    }

    public static String formatPerson(String firstName, String lastName, String userName) {
        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");
        return personFormat.format(new Object[] {firstName, lastName, userName});
    }
}
