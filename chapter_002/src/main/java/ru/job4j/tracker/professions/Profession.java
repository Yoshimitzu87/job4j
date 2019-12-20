package ru.job4j.tracker.professions;



public class Profession {
    private String name;
    private String surname;
    private String education;
    private int age;

    public Profession (String name, String surname, String education, int age) {


        this.name = name;
        this.surname = surname;
        this.education = education;
        this.age = age;

    }
    public String getName () {return this.name;}

    public void setName (String name) {this.name = name;}

    public String getSurname () {return this.surname;}

    public void setSurname (String surname) {this.surname = surname;}

    public String getEducation () {return this.education;}

    public void setEducation(String education) {this.education = education;}

    public int getAge () {return this.age;}

    public void setAge (int age) {this.age = age;}

}


