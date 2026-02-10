package com.example;

/**
 * Simple Calculator class for SonarQube coverage testing
 */
public class App {

    // Constants to replace magic numbers
    private static final int DISCOUNT_PERCENTAGE = 10;
    private static final int PERCENTAGE_DIVISOR = 100;

    /**
     * Calculates discount on price
     * @param price the original price
     * @return discounted amount
     */
    public int calculateDiscount(int price) {
        if (price < 0) {
            // New branch – likely untested
            throw new IllegalArgumentException("Price cannot be negative");
        }
        return price * DISCOUNT_PERCENTAGE / PERCENTAGE_DIVISOR;
    }

    /**
     * Formats name to uppercase
     * @param name the name to format
     * @return formatted name in uppercase, or empty string if name is null/empty
     */
    public String formatName(String name) {
        if (name == null) {
            return "";
        } else if (name.isEmpty()) {
            return "";
        } else if (name.length() > 20) {
            // New branch – not covered
            return name.substring(0, 20).toUpperCase();
        }
        return name.toUpperCase();
    }

    /**
     * Adds two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two numbers
     */
    public int divide(int a, int b) {
        if (b == 0) {
            // Exception branch (likely not tested)
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Checks if a number is positive
     */
    public boolean isPositive(int number) {
        if (number == 0) {
            // Extra branch
            return false;
        }
        return number > 0;
    }

    /**
     * Checks if a number is even
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * NEW METHOD – NOT COVERED
     */
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

    /**
     * PRIVATE METHOD – NEVER CALLED
     */
    private void internalAuditLog(String message) {
        System.out.println("AUDIT :: " + message);
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        App app = new App();
        System.out.println("5 + 3 = " + app.add(5, 3));
        System.out.println("5 - 3 = " + app.subtract(5, 3));
        System.out.println("5 * 3 = " + app.multiply(5, 3));
        System.out.println("5 / 3 = " + app.divide(5, 3));
    }
}
