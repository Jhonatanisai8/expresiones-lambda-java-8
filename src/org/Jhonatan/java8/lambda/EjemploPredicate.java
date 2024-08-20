package org.Jhonatan.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.Jhonatan.java8.lambda.Models.Usuario;

public class EjemploPredicate {
    public static void main(String[] args) {
        ejemploPredicate();
        ejemploBiPredicate();
        ejemploBiPredicateObjetos();
    }

    public static void ejemploPredicate() {

        /* siempre retorna un bolean */
        /* ejemplo para saber si un numero es mayor que 10 */
        System.out.println("\n\t=EJEMPLO DE PREDICATE=");
        Predicate<Integer> test = num -> num > 10;
        boolean resulado = test.test(5);
        System.out.println("EJEMPLO 01: " + resulado);

        System.out.println("\n\t=EJEMPLO 01 CON PREDICATE=");
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("RESULTADO 02: " + test2.test("ROLE_ADMfghIN"));

    }

    public static void ejemploBiPredicate() {
        /* resive dos parametros */
        System.out.println("\n\t=EJEMPLO BI-PREDICATE=");
        BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
        System.out.println("RESULTADO 01: son iguales las palabras: " + test3.test("hsola", "hola"));

        System.out.println("\n\t=EJEMPLO DE QUIEN ES MAYOR=");
        BiPredicate<Integer, Integer> test5 = (i, j) -> j > i;
        int i = 10;
        int j = 5;
        System.out.println("RESULTADO 03: " + j + ">" + i + ": " + test5.test(i, j));

        System.out.println("\n\t=EJEMPLO BI-PREDICATE SIMPLEFICADO=");

        BiPredicate<String, String> test4 = String::equals;
        System.out.println("RESULTADO 02: son iguales o no: " + test4.test("hola", "null"));
    }

    public static void ejemploBiPredicateObjetos() {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.setNombre("Juan");
        usuario2.setNombre("Juan");

        /* COMPARACION DE NOMBRES */
        BiPredicate<Usuario, Usuario> tes1 = (a, b) -> a.getNombre().equals(b.getNombre());
        System.out.println("Tienen mismo nombre los usuarios a y b: " + tes1.test(usuario1, usuario2));

    }
}
