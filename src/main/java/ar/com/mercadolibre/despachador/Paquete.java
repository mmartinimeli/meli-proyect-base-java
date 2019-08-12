package ar.com.mercadolibre.despachador;

public class Paquete {
    private String nombre;
    private float peso;

    public Paquete(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }
}
