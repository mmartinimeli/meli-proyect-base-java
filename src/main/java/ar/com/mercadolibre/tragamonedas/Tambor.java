package ar.com.mercadolibre.tragamonedas;

import java.util.Random;

public class Tambor {
    private int posicion;
    private final int MAX = 7;

    void girar(){
        Random numeroRandom = new Random();
        this.posicion = numeroRandom.nextInt((MAX)) + 1;
    }

    int obtenerPosicion(){
        return this.posicion;
    }
}
