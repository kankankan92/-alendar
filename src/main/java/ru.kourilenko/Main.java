package ru.kourilenko;


public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(7, 7, 2016);
//        Calendar calendar1 = new Calendar();
//        System.out.println(calendar.getAmericanDate());
        System.out.println(calendar.getRussianDate());
        calendar.addDay(7);
        System.out.println(calendar.getRussianDate());
        calendar.addDay(57);
        System.out.println(calendar.getRussianDate());
        calendar.addDay(365);
        System.out.println(calendar.getRussianDate());
        Calendar calendar2 = new Calendar(31, 12, 2016);
        calendar2.addDay(1);
        System.out.println(calendar2.getRussianDate());

    }
}

