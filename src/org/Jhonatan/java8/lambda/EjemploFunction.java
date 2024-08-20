package org.Jhonatan.java8.lambda;

import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        referenciaMetodos();
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
}
