package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Anton Frolov (spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    private double result;

    /**
     * СЛОЖЕНИЕ
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * ВЫЧИТАНИЕ
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * УМНОЖЕНИЕ
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * ДЕЛЕНИЕ
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }
}
