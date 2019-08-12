package ar.com.mercadolibre.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private static Biblioteca biblioteca = new Biblioteca();
    private ArrayList<Alquiler> alquileres;

    private Biblioteca(){
        this.alquileres = new ArrayList<>();
    }

    public static Biblioteca getInstance(){
        return biblioteca;
    }

    public Alquiler buscarAlquiler(Libro libro) {
        Alquiler alquilerEncontrado = this.alquileres
                .stream()
                .filter(x -> x.getTitulo().equals(libro.getTitulo()))
                .findFirst()
                .get();
        return alquilerEncontrado;
    }

    public void listarAlquiler() {

    }

    public void generarAlquiler(String titulo){

    }



}