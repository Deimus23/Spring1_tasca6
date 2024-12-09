package Ejercicio1.Main;
import Ejercicio1.Clases.NonGenericMethods;
public class Main{
public static void main(String[] args) {

    NonGenericMethods example1 = new NonGenericMethods(
            "Hola",
            "Món",
            "Java"
    );
    System.out.println("Obj1: " + example1.getObj1());
    System.out.println("Obj2: " + example1.getObj2());
    System.out.println("Obj3: " + example1.getObj3());
}
}