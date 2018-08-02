package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param dollar доллар.
     * @return Рубли.
     */
    public int dollarToRuble(int dollar) {
        return dollar * 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param euro евро.
     * @return Рубли.
     */
    public int euroToRuble(int euro) {
        return euro * 70;
    }
}