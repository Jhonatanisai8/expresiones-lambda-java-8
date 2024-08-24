package org.Jhonatan.java8.lambda;

/*
BiConsumer<T, U>: Acepta dos argumentos y no devuelve ningún resultado. Ideal
para operaciones en pares de valores, como en mapas.*/
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class EjemploBiconsumer {

    public static void main(String[] args) {

        Map<String, Integer> mapaFrutas = new HashMap<>();

        mapaFrutas.put("Pera", 3);
        mapaFrutas.put("Manzana", 4);
        mapaFrutas.put("Fresa", 6);
        mapaFrutas.put("Piña", 8);
        mapaFrutas.put("Sandia", 93);
        mapaFrutas.put("Mango", 7);
        mapaFrutas.put("Limon", 6);
        mapaFrutas.put("Banana", 34);

        // BiConsumer que imprime cada par clave-valor
        BiConsumer<String, Integer> imprimirMapaFrutas = (frutas, cantidad) ->
         System.out.println(frutas + " cant: " + cantidad);

        // Aplicar el BiConsumer a cada entrada en el mapa
        mapaFrutas.forEach(imprimirMapaFrutas);
    }
}
