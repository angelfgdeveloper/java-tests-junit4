package org.example.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

//    TESTS de comprobación
//    fizzBuzz(3) ⇒ "Fizz" *
//    fizzBuzz(6) ⇒ "Fizz" *
//    fizzBuzz(5) ⇒ "Buzz" *
//    fizzBuzz(10) ⇒ "Buzz" *
//    fizzBuzz(15) ⇒ "FizzBuzz" *
//    fizzBuzz(30) ⇒ "FizzBuzz" *
//    fizzBuzz(2) ⇒ "2" *
//    fizzBuzz(16) ⇒ "16" *

    @Test
    public void return_fizz_when_number_is_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void return_buzz_when_number_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void return_fizzbuzz_when_numbers_is_divisible_by_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void return_the_same_number_when_not_is_divisible_by_3_or_5_or_both() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }
}