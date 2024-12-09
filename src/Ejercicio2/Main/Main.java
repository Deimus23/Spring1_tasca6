package Ejercicio2.Main;

import Ejercicio2.Classes.GenericMethod;
import Ejercicio2.Classes.Persona;

public class Main {
    public static void main (String[]args) {
        Persona persona = new Persona("Anna", 28, "Fernandez");
        String lastname= "paconi";
        int money=0;
        GenericMethod.print(persona,lastname,money);
    }
}

