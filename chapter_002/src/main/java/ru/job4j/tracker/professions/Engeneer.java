package ru.job4j.tracker.professions;

public class Engeneer extends Profession {
    private String exp; //Стаж,Опыт
    private String spec; //Специализация
    private int cost; //Стоимость услуги

    public Engeneer(String name, String surname, String education, int age) {
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
