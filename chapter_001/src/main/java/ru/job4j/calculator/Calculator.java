package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {

    private double result;
    //сложение
    public void add(double first, double second) {
        this.result = first + second;
    }
    //вычитание
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    // деление
    public void div(double first, double second) {
        this.result = first / second;
    }
    //умножение
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}