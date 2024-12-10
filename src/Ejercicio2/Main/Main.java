package Ejercicio2.Main;

import Ejercicio2.Classes.GenericMethod;
import Ejercicio2.Classes.Peapol;


public class Main {
    public static void main (String[]args) {
        Peapol persona = new Peapol("Anna", 28, "Fernandez");
        String lastname= "paconi";
        int money=0;
        GenericMethod.print(persona,lastname,money);
    }
}

