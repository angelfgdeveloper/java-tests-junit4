package org.example.utils;

public class DateUtil {

    // Año bisiesto
    public static boolean isLeapYear(int year) {
        // version 3
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        Version 2
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            return true;
//        } else {
//            return false;
//        }

//        Version 1
//        if (year % 400 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
