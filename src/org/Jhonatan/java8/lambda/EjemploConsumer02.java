package org.Jhonatan.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer02 {
    public static void main(String[] args) {
        /* imprimir una lista de nombres usando un Consumer: */
        List<String> listaNombres = Arrays.asList("Pedro", "Juan", "Lorena", "Maria", "Carlos", "Alex");

        // Usando Consumer para imprimir cada nombre
        Consumer<String> imprimirListaNombres = nombre -> System.out.println(nombre);

        // Aplicar el Consumer a cada elemento de la lista
        listaNombres.forEach(imprimirListaNombres);

    }
}
