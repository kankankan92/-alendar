package ru.kourilenko;

public class CalendarUtil {

    public static String format(int a) {
        if (a < 10) {
            return "0" + a;
        }
        return "" + a;
    }

    private static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDaysInMonth(int i){
        return daysInMonths[i -1];
    }

    public static String formatMounth(int a) {
        return months[a - 1];
    }
}
