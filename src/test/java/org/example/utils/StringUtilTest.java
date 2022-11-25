package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    /*
    public static void main(String[] args) {
        // Pruebas automaticas (Hechas por nosotros mismos)
        //assertEquals(StringUtil.repeat("Hola", 3), "HolaHolaHola");
        //assertEquals(StringUtil.repeat("Hola", 1), "Hola");

        // Valor esperado & test
        //Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
        //Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

        private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
    */

    /**
     * @Test => Indica que utilizara la libreria de JUnit 4
     * Assert.assertEqual('Lo que espera', 'La ejecucion');
     *
     * */
    @Test
    public void repeat_string_once() {
        //Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
        //Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hola", -1);
    }

}