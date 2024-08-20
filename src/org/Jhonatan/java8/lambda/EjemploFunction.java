package org.Jhonatan.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        ejemploBiFunction();
    }

    public static void ejemplo01Function() {

        System.out.println("\n\t=EJEMPLO FUNCTION=");
        /* resive un argumento como parametro y devuelve algo */
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("Andrez");
        System.out.println(resultado);
    }

    public static void referenciaMetodos() {
        System.out.println("\n\t=EJEMPLO FUNCTION CON REFERENCIA DE METODOS=");

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("andrez"));
    }

    public static void ejemploBiFunction() {
        System.out.println("\n\t=EJEMPLO BI-FUNCTION=");
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());

        String r2 = f3.apply("Jhonatan", "Isai");
        System.out.println(r2);

        System.out.println("\n\t=EJEMPLO BI-FUNCTION=");
        BiFunction<String, String, String> f6 = String::concat;

        String r5 = f6.apply("Jhonatan", "Isai");
        System.out.println(r5);

    }

    public static void ejemplo02Function() {
        System.out.println("\n\t=OTRO EJEMPLO  CON BI-FUNCTION=");
        BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b);
        System.out.println(f4.apply("hola", "holaww"));

        System.out.println("\n\t=OTRO EJEMPLO CON BI-FUNCTION SIMPLEFICADO=");
        BiFunction<String, String, Integer> f5 = String::compareTo;
        System.out.println(f5.apply("hola", "holaww"));
    }
}
