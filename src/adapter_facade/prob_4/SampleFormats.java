package adapter_facade.prob_4;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

import java.util.GregorianCalendar;

public class SampleFormats {
    public static void main(String[] args) {
//    /* Date format. Examples:
//       4 Jul 1997
//       10 Mar 1979 */
//        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");     /* A pretty integer format. Examples:
//       4,235,682
//       5,487
//       42
//    */
//        DecimalFormat intFormat = new DecimalFormat("#,###");     /* A monetary format. Examples:
//       $ 4,235,670
//       $ 345.23
//       $ 0.48
//    */
//        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##"); /* A person format using first, last, and user names. Examples:
//       Weinman, Jerod [weinman]
//       Davis, Janet [davisjan]
//       Coahran, Marge [coahranm]        The {x} syntax means replace with the x'th index of an array.
//    */
//        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");

        /* Tests */
        System.out.println("Date: " + BasicFormat.formatDate(( new GregorianCalendar(2011, 4,24).getTime())));
        //GregorianCalendar 에서 month는 0~11월 까지 사용된다.

        System.out.println("Date: " + BasicFormat.formatDate(2011,6,25));
        System.out.println("Integer: " +  BasicFormat.formatLong(1234567) );
        System.out.println("Integer: " +  BasicFormat.formatLong(68));
        System.out.println("Integer: " +  BasicFormat.formatMoney(9812345.678) );
        System.out.println("Integer: " +  BasicFormat.formatMoney(9812345) );
        System.out.println("Integer: " +  BasicFormat.formatMoney(.78) );
        System.out.println("Person: " + BasicFormat.formatPerson("Weinman","Jerod","weinman"));




//        System.out.println("Date: " + dateFormat.format( new GregorianCalendar(2005, 7,4).getTime()));
//        // dateFormat.format() expects a Date object. Use
//        // GregorianCalendar to construct a Calendar object and the     // getTime() method to convert it to a Date.
//        System.out.println("Integer: " +  intFormat.format(1234567) );
//        System.out.println("Integer: " +  intFormat.format(67.7) );
//        System.out.println("Money: " +  dollarFormat.format(9812345.678) );
//        System.out.println("Money: " +  dollarFormat.format(9812345) );
//        System.out.println("Money: " +  dollarFormat.format(.78) );
//        System.out.println("Person: " + personFormat.format( new Object[]{"Weinman","Jerod","weinman"} ) );
        // We can create and initialize an Object array on the fly, as
        // shown above.
    }
}
