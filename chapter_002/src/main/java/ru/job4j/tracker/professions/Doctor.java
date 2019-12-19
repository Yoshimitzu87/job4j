package ru.job4j.tracker.professions;

public class Doctor extends Profession {
    public String exp; //Стаж,Опыт
    public String spec; //Специализация
    public int cost; //Стоимость услуги

    public Doctor(String name, String surname, String education, int age) {
        super(name, surname, education, age);

        this.exp = exp;
        this.spec = spec;
        this.cost = cost;

    }

    public String getExp() {
        return exp;
    }

    public String getSpec() {
        return spec;
    }

    public int getCost() {
        return cost;
    }

}
