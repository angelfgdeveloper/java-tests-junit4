package org.example.utils;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK; // Debil
        }

        if (password.matches("[a-zA-Z]+")) {
            // Exp. regular, contiene de la a ala z varias veces
            return SecurityLevel.WEAK; // Debil
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            // Exp. regular, contiene de la a ala z y números (+) varias veces
            return SecurityLevel.MEDIUM; // Medio
        }

        return SecurityLevel.STRONG; // Fuerte
    }

}
