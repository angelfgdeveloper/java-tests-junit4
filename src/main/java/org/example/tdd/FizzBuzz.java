package org.example.tdd;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return  "Buzz";
        } else {
            return number + "";
        }
    }
}
