package org.Jhonatan.java8.lambda.Aritmetica;

public class EjemploOperacion {
    public static void main(String[] args) {
        // expresión que se ejecutará cuando se invoque el método ejecutar
        Operacion suma = (a, b) -> a + b;
        System.out.println("La suma es: " + suma.ejecutar(12, 34));
    }
}
