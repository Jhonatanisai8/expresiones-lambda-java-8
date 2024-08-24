package org.Jhonatan.java8.lambda;
/*
La interfaz Function<T, R> es otra de las interfaces funcionales predefinidas en el
 paquete java.util.function, y es utilizada para representar una función que toma un 
 argumento de tipo T y devuelve un resultado de tipo R.


 La interfaz BiFunction<T, U, R>: es una de las interfaces funcionales predefinidas en Java que se 
 utiliza para representar una función que acepta dos argumentos de tipos T y U, y devuelve un
  resultado de tipo R. Es útil cuando necesitas realizar operaciones que involucran dos entradas y 
  producir un resultado.
 */
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        ejemploBiFunction();
    }

    public static void ejemplo01Function() {

        System.out.println("\n\t=EJEMPLO FUNCTION=");
        /* resive un argumento como parametro y devuelve un valor */
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("Andrez");
        System.out.println(resultado);
    }

    public static void referenciaMetodos() {
        System.out.println("\n\t=EJEMPLO FUNCTION CON REFERENCIA DE METODOS=");

        /* resive un String y devuelve un String */
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("andrez"));
    }

    public static void ejemploBiFunction() {
        System.out.println("\n\t=EJEMPLO BI-FUNCTION=");

        /*
         * 1º argumento
         * 2º argumento
         * 3º el tipo de dato que retorna
         */

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());

        String r2 = f3.apply("Jhonatan", "Isai");
        System.out.println(r2);

        System.out.println("\n\t=EJEMPLO BI-FUNCTION SIMPLEFICADO=");
        BiFunction<String, String, String> f6 = String::concat;

        String r5 = f6.apply("Jhonatan", "  Isai");
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
