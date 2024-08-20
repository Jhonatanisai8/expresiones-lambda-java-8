package org.Jhonatan.java8.lambda.Aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double computer(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    /* otra implementacion */
    public double computarConBifunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}
