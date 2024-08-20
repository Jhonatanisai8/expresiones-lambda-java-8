package org.Jhonatan.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.Jhonatan.java8.lambda.Models.Usuario;

public class EjemploConsumer {
    public static void main(String[] args) throws Exception {
        ejemploSupplierUsuario();
    }

    public static void ejemplo01() {
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
            System.out.println(nombre + " tiene " + edad + " años.");
        };

        consumidorBi.accept("PEPE", 56);
    }

    public static void ejemplo02() {
        System.out.println("\n\t=OTRO EJEMPLO CON CONSUMER SIMPLEFICADO=");

        /* se utilixan en apis de java como el Strem */
        Consumer<String> consumidor02 = System.out::println;
        consumidor02.accept("HOLA MUNDO!");

        System.out.println("\n\t=EJEMPLO CON LISTAS=");
        List<String> listaNombres = Arrays.asList("andres", "pepe", "luz", "paco");
        listaNombres.forEach(consumidor02);

        System.out.println("\n\t=EJEMPLO DE USUARIO=");
        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        };

        asignarNombre.accept(usuario, "Andrez");
        System.out.println("Nombre de usuario: " + usuario.getNombre());
    }

    public static void ejemplUsuarioSimpleficado() {

        System.out.println("\n\t=EJEMPLO DE USUARIO SIMPLEFICADO=");

        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrez");
        System.out.println("Nombre de usuario: " + usuario.getNombre());

    }

    public static void ejemploSupplier() {
       
        /*la cual no resive ningun argumento y devuelve un valor de aacuerdo al tipo de dato */
        System.out.println("\n\t=EJEMPLO Supplier=");
        Supplier<String> provedor = () -> {
            return "Hola mundo lambda supplier.";
        };

        /*forma simpleficada */
        Supplier<String> provedor02 = () -> "Hola Mundo Lambda supplier simpleficado.";

        System.out.println(provedor.get());
        System.out.println(provedor02.get());
    }

    public static void ejemploSupplierUsuario(){

        System.out.println("\n\t=EJEMPLO Supplier USUARIO=");
        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrez");

        System.out.println("Nombre usuario: "+usuario.getNombre());


    }
}
