package org.example.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result += price;
        }

        // Ejemplo: result = $30.0
        // Descuento del (discount) => 50%

        // 100 - 50(descuento) = 50
        // 50 / 100 = 0.5
        // 30.0(total) * 0.5 = 15.0 resultado final con descuento

        return result * ((100 - discount) / 100); // Formula para hacer descuento
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
