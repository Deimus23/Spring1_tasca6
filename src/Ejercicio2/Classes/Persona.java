package Ejercicio2.Classes;

public class Persona {
    private String name;
    private String surname;
    private int  age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Persona(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }
}
