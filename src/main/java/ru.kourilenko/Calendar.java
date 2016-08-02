package ru.kourilenko;

import java.util.Date;

public class Calendar {
    private int day;
    private int month;
    private int year;


    Calendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Calendar() {
        this.day = new Date().getDate();
        this.month = (new Date().getMonth() + 1);
        this.year = new Date().getYear() + 1900;
    }

    public String getRussianDate() {
        return CalendarUtil.format(day) + "." + CalendarUtil.formatMounth(month) + "." + year;
    }

    public String getAmericanDate() {
        return CalendarUtil.formatMounth(month) + "/" + CalendarUtil.format(day) + "/" + year;
    }

    public void addDay(int a) {
        while (a > 365) {
            year++;
            a = a - 365;
        }
        while (a > CalendarUtil.getDaysInMonth(month)) {
            a = a - CalendarUtil.getDaysInMonth(month);
            month++;
            if (month > 12) {
                year++;
                month = month - 12;
            }
        }
        day = day + a;
        if (day > CalendarUtil.getDaysInMonth(month)) {
            day = day - CalendarUtil.getDaysInMonth(month);
            month++;
            if (month > 12) {
                year++;
                month = month - 12;
            }
        }
    }


}
