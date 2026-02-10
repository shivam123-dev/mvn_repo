package com.example;

/**
 * Simple Calculator class for SonarQube coverage testing
 */
public class App {

    private static final int DISCOUNT_PERCENTAGE = 10;
    private static final int PERCENTAGE_DIVISOR = 100;

    public int calculateDiscount(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        return price * DISCOUNT_PERCENTAGE / PERCENTAGE_DIVISOR;
    }

    public String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        } else if (name.length() > 20) {
            return name.substring(0, 20).toUpperCase();
        }
        return name.toUpperCase();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public boolean isPositive(int number) {
        if (number == 0) {
            return false;
        }
        return number > 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getUserType(int age) {
        if (age < 0) {
            return "INVALID";
        } else if (age < 18) {
            return "MINOR";
        } else if (age < 60) {
            return "ADULT";
        } else {
            return "SENIOR";
        }
    }

    private void internalAuditLog(String message) {
        System.out.println("AUDIT :: " + message);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("5 + 3 = " + app.add(5, 3));
    }
}
