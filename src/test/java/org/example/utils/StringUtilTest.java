package org.example.utils;

public class StringUtilTest {

    public static void main(String[] args) {
        // Prueba de forma manual
        String result = StringUtil.repeat("Hola", 3);
        //System.out.println(result);
        if (result.equals("HolaHolaHola")) {
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("Hola", 1);
        System.out.println(result2);
        if (!result2.equals("Hola")) {
            System.out.println("ERROR");
        }

    }

}