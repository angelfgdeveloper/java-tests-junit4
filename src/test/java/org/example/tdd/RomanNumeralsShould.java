package org.example.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralsShould {

//    TEST de comprobación
//    arabicToRoman(1) ⇒ "I"
//    arabicToRoman(2) ⇒ "II"
//    arabicToRoman(3) ⇒ "III"
//    arabicToRoman(5) ⇒ "V"
//    arabicToRoman(6) ⇒ "VI"
//    arabicToRoman(7) ⇒ "VII"
//    arabicToRoman(10) ⇒ "X"
//    arabicToRoman(11) ⇒ "XI"
//    arabicToRoman(15) ⇒ "XV"
//    arabicToRoman(16) ⇒ "XVI"
//    arabicToRoman(50) ⇒ "L"
//    arabicToRoman(51) ⇒ "LI"
//    arabicToRoman(55) ⇒ "LV"
//    arabicToRoman(56) ⇒ "LVI"
//    arabicToRoman(60) ⇒ "LX"
//    arabicToRoman(70) ⇒ "LXX"
//    arabicToRoman(80) ⇒ "LXXX"
//    arabicToRoman(81) ⇒ "LXXXI"
//    arabicToRoman(85) ⇒ "LXXXV"
//    arabicToRoman(86) ⇒ "LXXXVI"
//    arabicToRoman(126) ⇒ "CXXVI"
//    arabicToRoman(2507) ⇒ "MMDVII"

//    TEST de comprobación con resta
//    arabicToRoman(4) ⇒ "IV"
//    arabicToRoman(9) ⇒ "IX"
//    arabicToRoman(14) ⇒ "XIV"
//    arabicToRoman(19) ⇒ "XIX"
//    arabicToRoman(24) ⇒ "XXIV"
//    arabicToRoman(40) ⇒ "XL"
//    arabicToRoman(49) ⇒ "XLIX"
//    arabicToRoman(90) ⇒ "XC"
//    arabicToRoman(99) ⇒ "XCIX"
//    arabicToRoman(400) ⇒ "CD"
//    arabicToRoman(900) ⇒ "CM"

    private  RomanNumerals romanNumerals;

    @Before // Para ejecutar antes de que inicien los metodos TESTs
    public void setup() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void return_number_equivalent_to_roman() {
        assertThat(RomanNumerals.arabicToRoman(1), is("I"));
        assertThat(RomanNumerals.arabicToRoman(2), is("II"));
        assertThat(RomanNumerals.arabicToRoman(3), is("III"));

        assertThat(RomanNumerals.arabicToRoman(5), is("V"));
        assertThat(RomanNumerals.arabicToRoman(6), is("VI"));
        assertThat(RomanNumerals.arabicToRoman(7), is("VII"));

        assertThat(RomanNumerals.arabicToRoman(10), is("X"));
        assertThat(RomanNumerals.arabicToRoman(11), is("XI"));
        assertThat(RomanNumerals.arabicToRoman(15), is("XV"));
        assertThat(RomanNumerals.arabicToRoman(16), is("XVI"));

        assertThat(RomanNumerals.arabicToRoman(50), is("L"));
        assertThat(RomanNumerals.arabicToRoman(51), is("LI"));
        assertThat(RomanNumerals.arabicToRoman(55), is("LV"));
        assertThat(RomanNumerals.arabicToRoman(56), is("LVI"));

        assertThat(RomanNumerals.arabicToRoman(60), is("LX"));
        assertThat(RomanNumerals.arabicToRoman(70), is("LXX"));

        assertThat(RomanNumerals.arabicToRoman(80), is("LXXX"));
        assertThat(RomanNumerals.arabicToRoman(81), is("LXXXI"));
        assertThat(RomanNumerals.arabicToRoman(85), is("LXXXV"));
        assertThat(RomanNumerals.arabicToRoman(86), is("LXXXVI"));

        assertThat(RomanNumerals.arabicToRoman(126), is("CXXVI"));

        assertThat(RomanNumerals.arabicToRoman(2507), is("MMDVII"));
    }

    @Test
    public void return_number_equivalent_to_roman_when_is_subtracted() {
        assertThat(RomanNumerals.arabicToRoman(9), is("IX"));
        assertThat(RomanNumerals.arabicToRoman(14), is("XIV"));
        assertThat(RomanNumerals.arabicToRoman(19), is("XIX"));
        assertThat(RomanNumerals.arabicToRoman(24), is("XXIV"));
        assertThat(RomanNumerals.arabicToRoman(40), is("XL"));
        assertThat(RomanNumerals.arabicToRoman(49), is("XLIX"));
        assertThat(RomanNumerals.arabicToRoman(90), is("XC"));
        assertThat(RomanNumerals.arabicToRoman(99), is("XCIX"));
        assertThat(RomanNumerals.arabicToRoman(400), is("CD"));
        assertThat(RomanNumerals.arabicToRoman(900), is("CM"));
    }
}