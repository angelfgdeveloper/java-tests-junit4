package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

//import org.hamcrest.CoreMatchers;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.*;

// La importacion se comenta ya que esta deprecado
//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateUtilLeapYearShould {

     /*
      -All years divisible by 400 ARE leap years (1600, 2000, 2400),
      -All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
      -All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
      -All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        // Probar la funcion, en seguida un comprobador matcher (que este valor sea cierto)
        // is => clase CoreMatchers (Comprueba que sea true)
        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));

        assertThat(DateUtil.isLeapYear(1600), equalTo(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(DateUtil.isLeapYear(1700), is(false));
        assertThat(DateUtil.isLeapYear(1800), is(false));
        assertThat(DateUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat(DateUtil.isLeapYear(1996), is(true));
        assertThat(DateUtil.isLeapYear(2004), is(true));
        assertThat(DateUtil.isLeapYear(2008), is(true));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4() {
        assertThat(DateUtil.isLeapYear(2017), is(false));
        assertThat(DateUtil.isLeapYear(2019), is(false));
        assertThat(DateUtil.isLeapYear(2018), is(false));
    }
}