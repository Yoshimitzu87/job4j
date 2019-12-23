package oop.pojo;

import java.util.Date;

public class Colledge {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName ("Ivan Ivanov");
        student.setGroup("RENG-15");
        student.setCreated(new Date());

        System.out.println(student.getName() + " FROM : " + student.getGroup() + " " + student.getCreated());
    }
}
