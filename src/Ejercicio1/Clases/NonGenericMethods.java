package Ejercicio1.Clases;

public class NonGenericMethods{
    private String obj1;
    private String obj2;
    private String obj3;

    public String getObj2() {
        return obj2;
    }

    public String getObj3() {
        return obj3;
    }

    public String getObj1() {
        return obj1;
    }

    public NonGenericMethods(String obj1, String obj2, String obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
}