package org.Jhonatan.java8.lambda;

import org.Jhonatan.java8.lambda.Aritmetica.Aritmetica;
import org.Jhonatan.java8.lambda.Aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        System.out.println("\n\t=EJEMPLO CON BIFUNCTION=");
        Calculadora calculadora = new Calculadora();

        /* implementacion al vuelo */
        System.out.println("SUMA: " + calculadora.computarConBifunction(12, 12, (a, b) -> a + b));

    }

    public static void ejemplo01() {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        /* MAS SIMPLEFICADO */
        Aritmetica suma01 = Double::sum;

        Calculadora calculadora = new Calculadora();
        int a = 34;
        int b = 4;
        System.out.println("SUMA: " + calculadora.computer(a, b, suma));
        System.out.println("SUMA 01: " + calculadora.computer(a, b, suma01));
        System.out.println("RESTA: " + calculadora.computer(a, b, resta));

        /* implementacion al vuelo */
        System.out.println("MULTIPLICACION: " + calculadora.computer(a, b, (t, u) -> t * u));
    }
}
