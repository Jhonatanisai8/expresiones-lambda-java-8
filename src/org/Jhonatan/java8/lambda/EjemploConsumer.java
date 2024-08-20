package org.Jhonatan.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\t=EXPRESIONES LAMBDA: EJEMPLO CONSUNER=");

        System.out.println("=EJEMPLO SALUDO=");
        /* consumimos lo que se pasa por parametro, no retorna */
        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };

        consumidor.accept("Hola que tal!");

        System.out.println("=EJEMPLO FECHA=");
        /* de tipo date */
        Consumer<Date> consumidor01 = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(formato.format(fecha));
        };

        consumidor01.accept(new Date());

        System.out.println("\n\t=OTRO EJEMPLO CON BI-CONSUMER=");

        /* cuando son dos o mas parametros se usan parametros */
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre+" tiene "+edad+" años.");
        };

        consumidorBi.accept("PEPE", 56);
    }
}
